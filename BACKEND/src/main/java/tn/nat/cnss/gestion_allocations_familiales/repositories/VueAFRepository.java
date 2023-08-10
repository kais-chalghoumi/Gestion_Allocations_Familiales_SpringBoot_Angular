package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;

@Repository
public interface VueAFRepository extends JpaRepository<VueAF,Integer> {
}
