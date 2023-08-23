package tn.nat.cnss.gestion_allocations_familiales.services;

import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;

import java.util.List;

public interface VueAFServicesInterface {

    List<VueAF> getAllByAssMatOrderByRangBen (Integer assMat);
    VueAF findById (Integer benIduCnss);
    VueAF updateVueAF (VueAF vueAF,Integer benIduCnss);
    void verificationVueAF (VueAF vueAF,long yearsDifference);
    long getAge (Integer benIduCnss);
}
