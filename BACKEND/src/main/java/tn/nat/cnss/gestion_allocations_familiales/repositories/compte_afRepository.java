package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.compte_af;

@Repository
public interface compte_afRepository extends JpaRepository<compte_af,Integer> {
}
