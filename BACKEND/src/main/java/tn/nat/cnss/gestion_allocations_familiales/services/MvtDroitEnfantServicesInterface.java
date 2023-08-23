package tn.nat.cnss.gestion_allocations_familiales.services;

import tn.nat.cnss.gestion_allocations_familiales.entities.MvtDroitEnfant;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;

import java.util.List;

public interface MvtDroitEnfantServicesInterface {

    List<MvtDroitEnfant> getAllById_BenIduCnss (Integer benIduCnss);
    List<MvtDroitEnfant> addOrUpdateListMvtDroitEnfant (VueAF vueAF);
}
