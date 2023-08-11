package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.Agtcnss;
import tn.nat.cnss.gestion_allocations_familiales.repositories.AgtcnssRepository;

@Slf4j
@Service
public class AgtcnssServicesImpl implements AgtcnssServicesInterface{

    @Autowired
    AgtcnssRepository agtcnssRepository;

    public Agtcnss findByIdtMatag(Integer idtMatag) {
        return agtcnssRepository.findByIdtMatag(idtMatag);
    }
}
