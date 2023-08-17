package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;
import tn.nat.cnss.gestion_allocations_familiales.repositories.VueAFRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Slf4j
@Service
public class VueAFServicesImpl implements VueAFServicesInterface{

    @Autowired
    VueAFRepository vueAFRepository;
    @Override
    public List<VueAF> getAllByAssMatOrderByRangBen(Integer assMat) {
        return vueAFRepository.getAllByAssMatOrderByRangBen(assMat);
    }

    @Override
    public VueAF findById (Integer benIduCnss) {
        return vueAFRepository.findById(benIduCnss).get();
    }

    @Override
    public VueAF updateVueAF(VueAF vueAF,Integer benIduCnss) {
        VueAF existingVueAF = vueAFRepository.findById(benIduCnss).orElseThrow(() -> new EntityNotFoundException("Person not found"));
//        existingVueAF.setBenIduCnss(vueAF.getBenIduCnss());
//        existingVueAF.setBenNom(vueAF.getBenNom());
//        existingVueAF.setBenPrenom(vueAF.getBenPrenom());
//        existingVueAF.setAssMat(vueAF.getAssMat());
//        existingVueAF.setAssCle(vueAF.getAssCle());
//        existingVueAF.setBenDtnais(vueAF.getBenDtnais());
//        existingVueAF.setRangBen(vueAF.getRangBen());
//        existingVueAF.setCompte(vueAF.getCompte());
        existingVueAF.setDroit(vueAF.getDroit());
        existingVueAF.setDateDB(vueAF.getDateDB());
        existingVueAF.setDateFin(vueAF.getDateFin());
        existingVueAF.setDocBen(vueAF.getDocBen());
        return vueAFRepository.save(existingVueAF);
    }
}
