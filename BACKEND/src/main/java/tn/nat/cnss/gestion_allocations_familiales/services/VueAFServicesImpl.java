package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;
import tn.nat.cnss.gestion_allocations_familiales.repositories.VueAFRepository;

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
    public VueAF findByBenIduCnss(Integer benIduCnss) {
        return vueAFRepository.findByBenIduCnss(benIduCnss);
    }
}
