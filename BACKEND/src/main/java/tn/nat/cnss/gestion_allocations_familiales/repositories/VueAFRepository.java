package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;

import java.util.List;

@Repository
public interface VueAFRepository extends JpaRepository<VueAF,Integer> {

    List<VueAF> getAllByAssMatOrderByRangBen (Integer assMat);
    VueAF findByBenIduCnss (Integer benIduCnss);
}
