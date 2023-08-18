package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.MvtDroitEnfant;
import tn.nat.cnss.gestion_allocations_familiales.repositories.MvtDroitEnfantRepository;

import java.util.List;

@Slf4j
@Service
public class MvtDroitEnfantServicesImpl implements MvtDroitEnfantServicesInterface{

    @Autowired
    MvtDroitEnfantRepository mvtDroitEnfantRepository;

    @Override
    public List<MvtDroitEnfant> getAllById_BenIduCnss (Integer benIduCnss){
        return mvtDroitEnfantRepository.getAllById_BenIduCnss(benIduCnss);
    };

}
