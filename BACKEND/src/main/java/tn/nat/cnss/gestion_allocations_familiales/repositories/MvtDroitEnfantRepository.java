package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.MvtDroitEnfant;
import tn.nat.cnss.gestion_allocations_familiales.entities.MvtDroitEnfantPK;

@Repository
public interface MvtDroitEnfantRepository extends JpaRepository<MvtDroitEnfant, MvtDroitEnfantPK> {
}
