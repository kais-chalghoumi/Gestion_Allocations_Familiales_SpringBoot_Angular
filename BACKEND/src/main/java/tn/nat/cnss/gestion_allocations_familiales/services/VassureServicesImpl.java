package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.Vassure;
import tn.nat.cnss.gestion_allocations_familiales.repositories.VassureRepository;

@Slf4j
@Service
public class VassureServicesImpl implements VassureServicesInterface{

    @Autowired
    VassureRepository vassureRepository;

    @Override
    public Vassure findByAssMatAndAssCle(Integer assMat, Integer assCle) {
        return vassureRepository.findByAssMatAndAssCle(assMat,assCle);
    }
}
