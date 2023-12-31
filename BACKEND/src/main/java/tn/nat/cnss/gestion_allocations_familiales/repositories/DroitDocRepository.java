package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.DroitDoc;
import tn.nat.cnss.gestion_allocations_familiales.entities.DroitDocPK;

import java.util.List;

@Repository
public interface DroitDocRepository extends JpaRepository<DroitDoc, DroitDocPK> {

}
