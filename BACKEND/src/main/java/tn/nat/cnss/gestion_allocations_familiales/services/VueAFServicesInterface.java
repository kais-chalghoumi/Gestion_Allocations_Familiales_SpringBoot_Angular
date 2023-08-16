package tn.nat.cnss.gestion_allocations_familiales.services;

import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;

import java.util.List;

public interface VueAFServicesInterface {

    List<VueAF> getAllByAssMatOrderByRangBen (Integer assMat);
    VueAF findByBenIduCnss (Integer benIduCnss);
}
