package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.Vassure;

@Repository
public interface VassureRepository extends JpaRepository<Vassure,Integer> {

    Vassure findByAssMatAndAssCle (Integer assMat, Integer assCle);
}
