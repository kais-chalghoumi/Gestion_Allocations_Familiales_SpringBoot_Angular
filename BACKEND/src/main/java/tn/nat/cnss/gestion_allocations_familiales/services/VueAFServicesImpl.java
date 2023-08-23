package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamiliale;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamilialePK;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;
import tn.nat.cnss.gestion_allocations_familiales.repositories.AllocationFamilialeRepository;
import tn.nat.cnss.gestion_allocations_familiales.repositories.VueAFRepository;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Slf4j
@Service
public class VueAFServicesImpl implements VueAFServicesInterface{

    @Autowired
    VueAFRepository vueAFRepository;

    @Autowired
    AllocationFamilialeRepository allocationFamilialeRepository;

    @Autowired
    AllocationFamilialeHistServicesImpl allocationFamilialeHistServices;

    @Override
    public List<VueAF> getAllByAssMatOrderByRangBen(Integer assMat) {
        return vueAFRepository.getAllByAssMatOrderByRangBen(assMat);
    }

    @Override
    public VueAF findById (Integer benIduCnss) {
        return vueAFRepository.findById(benIduCnss).get();
    }

    @Override
    @Transactional
    public VueAF updateVueAF(VueAF vueAF,Integer benIduCnss) {
        //update vueAF
        VueAF existingVueAF = vueAFRepository.findById(benIduCnss).orElseThrow(() -> new EntityNotFoundException("Person not found"));
        LocalDate birthDay = existingVueAF.getBenDtnais();
        LocalDate dateNow = LocalDate.now();
        long yearsDifference = (ChronoUnit.DAYS.between(birthDay, dateNow)) / 365;
        if(yearsDifference > 1){
            existingVueAF.setDateDB(dateNow.minusYears(1));
        }else {
            existingVueAF.setDateDB(birthDay);
        }
        existingVueAF.setDroit(vueAF.getDroit());
        existingVueAF.setDocBen(vueAF.getDocBen());
        vueAFRepository.save(existingVueAF);
        verificationVueAF(existingVueAF,yearsDifference);
        //update allocation_familiale
        if (allocationFamilialeRepository.findById(benIduCnss,vueAF.getAssMat(),vueAF.getAssCle()) == null){
            AllocationFamiliale allocationFamiliale = new AllocationFamiliale();
            AllocationFamilialePK allocationFamilialePK = new AllocationFamilialePK();
            allocationFamilialePK.setBenIduCnss(benIduCnss);
            allocationFamilialePK.setAssMat(existingVueAF.getAssMat());
            allocationFamilialePK.setAssCle(existingVueAF.getAssCle());
            allocationFamiliale.setId(allocationFamilialePK);
            allocationFamiliale.setDroitId(existingVueAF.getDroit());
            allocationFamiliale.setDocId(existingVueAF.getDocBen());
            allocationFamiliale.setDtDeb(existingVueAF.getDateDB());
            allocationFamiliale.setDtFin(existingVueAF.getDateFin());
            allocationFamiliale.setRangAf(existingVueAF.getRangBen());
            allocationFamiliale.setCompte(existingVueAF.getCompte());
            allocationFamiliale.setMatAgt(69393);
            allocationFamiliale.setBrAgt(81);
            allocationFamiliale.setNatOpr("تسجيل حقوق الابناء");
            allocationFamiliale.setDateOpr(LocalDate.now());
            allocationFamilialeRepository.save(allocationFamiliale);
        } else {
            AllocationFamiliale allocationFamiliale = allocationFamilialeRepository.findById(benIduCnss,vueAF.getAssMat(),vueAF.getAssCle());
            allocationFamiliale.setDroitId(existingVueAF.getDroit());
            allocationFamiliale.setDocId(existingVueAF.getDocBen());
            allocationFamiliale.setDtDeb(existingVueAF.getDateDB());
            allocationFamiliale.setDtFin(existingVueAF.getDateFin());
            allocationFamiliale.setRangAf(existingVueAF.getRangBen());
            allocationFamiliale.setCompte(existingVueAF.getCompte());
            allocationFamiliale.setMatAgt(69393);
            allocationFamiliale.setBrAgt(81);
            allocationFamiliale.setNatOpr("تسجيل حقوق الابناء");
            allocationFamiliale.setDateOpr(LocalDate.now());
            allocationFamilialeRepository.save(allocationFamiliale);
        }
        allocationFamilialeHistServices.addAllocationFamilialeHist(benIduCnss,vueAF.getAssMat(),vueAF.getAssCle(),existingVueAF.getDroit(),existingVueAF.getDocBen(), existingVueAF.getDateDB(),existingVueAF.getDateFin(),existingVueAF.getRangBen(),existingVueAF.getCompte(), 69393,81,"تسجيل حقوق الابناء",LocalDate.now());
        return existingVueAF;
    }

    @Override
    public void verificationVueAF(VueAF vueAF,long yearsDifference) {
        if (vueAF.getDocBen().equals("F") || vueAF.getDocBen().equals("H")){
            vueAF.setDateFin(vueAF.getBenDtnais().plusYears(100));
            vueAFRepository.save(vueAF);
        }

        if (vueAF.getDocBen().equals("A") && yearsDifference >= 16 && yearsDifference < 18){
            vueAF.setDateFin(vueAF.getBenDtnais().plusYears(18));
            vueAFRepository.save(vueAF);
        } else if (vueAF.getDocBen().equals("A") && yearsDifference > 18 && yearsDifference < 16){
            vueAF.setDocBen("X");
            vueAF.setDroit(1);
            vueAF.setDateFin(LocalDate.of(1900, 1, 1));
            vueAFRepository.save(vueAF);
        }

        if (vueAF.getDocBen().equals("V") && yearsDifference <= 16){
            vueAF.setDateFin(vueAF.getBenDtnais().plusYears(16));
            vueAFRepository.save(vueAF);
        } else if(vueAF.getDocBen().equals("V") && yearsDifference > 16){
            vueAF.setDocBen("X");
            vueAFRepository.save(vueAF);
        }

        if(vueAF.getDocBen().equals("S") && yearsDifference > 16 && yearsDifference <= 21){
            LocalDate prochain30Septembre = LocalDate.of(LocalDate.now().getYear(), 9, 30);
            if (LocalDate.now().isAfter(prochain30Septembre) || LocalDate.now().equals(prochain30Septembre)) {
                prochain30Septembre = prochain30Septembre.plusYears(1);
            }
            vueAF.setDateFin(prochain30Septembre);
            vueAFRepository.save(vueAF);
        } else if (vueAF.getDocBen().equals("S") && yearsDifference > 21){
            vueAF.setDocBen("X");
            vueAFRepository.save(vueAF);
        }

        if(vueAF.getDocBen().equals("D") && yearsDifference <= 21){
            vueAF.setDateFin(vueAF.getBenDtnais().plusYears(21));
            vueAFRepository.save(vueAF);
        } else if (vueAF.getDocBen().equals("D") && yearsDifference > 21){
            vueAF.setDroit(1);
            vueAF.setDateFin(LocalDate.of(1900, 1, 1));
            vueAFRepository.save(vueAF);
        }

    }

    @Override
    public long getAge(Integer benIduCnss) {
        VueAF res = vueAFRepository.findById(benIduCnss).get();
        LocalDate birthDay = res.getBenDtnais();
        LocalDate dateNow = LocalDate.now();
        return (ChronoUnit.DAYS.between(birthDay, dateNow)) / 365;
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void verificationAllVueAF() {
        List<VueAF> vueAFList = vueAFRepository.findAll();
        for (VueAF v : vueAFList) {
            LocalDate birthDay = v.getBenDtnais();
            LocalDate dateNow = LocalDate.now();
            long yearsDifference = (ChronoUnit.DAYS.between(birthDay, dateNow)) / 365;
            verificationVueAF(v,yearsDifference);
            log.info("ok");
        }
    }


}