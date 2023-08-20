package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamilialeHist;
import tn.nat.cnss.gestion_allocations_familiales.repositories.AllocationFamilialeHistRepository;

import java.util.Date;

@Slf4j
@Service
public class AllocationFamilialeHistServicesImpl implements AllocationFamilialeHistServicesInterface{
    private final AllocationFamilialeHistRepository allocationFamilialeHistRepository;

    public AllocationFamilialeHistServicesImpl(AllocationFamilialeHistRepository allocationFamilialeHistRepository) {
        this.allocationFamilialeHistRepository = allocationFamilialeHistRepository;
    }

    @Override
    public AllocationFamilialeHist addAllocationFamilialeHist(Integer benIduCnss, Integer assMat, Integer assCle, Integer droitId, String docId, Date dtDeb, Date dtFin, Integer rangAf, Integer compte, Integer matAgt, Integer brAgt, String natOpr, Date dateOpr) {
        AllocationFamilialeHist allocationFamilialeHist = new AllocationFamilialeHist();
        allocationFamilialeHist.setBenIduCnss(benIduCnss);
        allocationFamilialeHist.setAssMat(assMat);
        allocationFamilialeHist.setAssCle(assCle);
        allocationFamilialeHist.setDroitId(droitId);
        allocationFamilialeHist.setDocId(docId);
        allocationFamilialeHist.setDtDeb(dtDeb);
        allocationFamilialeHist.setDtFin(dtFin);
        allocationFamilialeHist.setRangAf(rangAf);
        allocationFamilialeHist.setCompte(compte);
        allocationFamilialeHist.setMatAgt(matAgt);
        allocationFamilialeHist.setBrAgt(brAgt);
        allocationFamilialeHist.setNatOpr(natOpr);
        allocationFamilialeHist.setDateOpr(dateOpr);
        allocationFamilialeHistRepository.save(allocationFamilialeHist);
        return null;
    }
}
