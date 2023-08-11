package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.Agtcnss;

@Repository
public interface AgtcnssRepository extends JpaRepository<Agtcnss,Integer> {

    Agtcnss findByIdtMatag (Integer IdtMatag);
}
