package tn.nat.cnss.gestion_allocations_familiales.services;

import tn.nat.cnss.gestion_allocations_familiales.entities.Vassure;

public interface VassureServicesInterface {

    public Vassure findByAssMatAndAssCle (Integer assMat, Integer assCle);
}
