package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamiliale;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamilialePK;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;
import tn.nat.cnss.gestion_allocations_familiales.repositories.AllocationFamilialeRepository;
import tn.nat.cnss.gestion_allocations_familiales.repositories.VueAFRepository;

import javax.persistence.Column;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class VueAFServicesImpl implements VueAFServicesInterface{

    @Autowired
    VueAFRepository vueAFRepository;

    @Autowired
    AllocationFamilialeRepository allocationFamilialeRepository;

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
        existingVueAF.setDroit(vueAF.getDroit());
        existingVueAF.setDateDB(vueAF.getDateDB());
        existingVueAF.setDateFin(vueAF.getDateFin());
        existingVueAF.setDocBen(vueAF.getDocBen());
        vueAFRepository.save(existingVueAF);
        //update allocation_familiale
        AllocationFamilialePK allocationFamilialePK = new AllocationFamilialePK();
        if (allocationFamilialeRepository.findById(benIduCnss,vueAF.getAssMat(),vueAF.getAssCle()) == null){
            AllocationFamiliale allocationFamiliale = new AllocationFamiliale();
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
            allocationFamiliale.setDateOpr(new Date());
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
            allocationFamiliale.setDateOpr(new Date());
            allocationFamilialeRepository.save(allocationFamiliale);
        }

        return existingVueAF;
    }
}
