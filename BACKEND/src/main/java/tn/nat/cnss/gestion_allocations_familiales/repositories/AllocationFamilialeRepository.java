package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamiliale;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamilialePK;

@Repository
public interface AllocationFamilialeRepository extends JpaRepository<AllocationFamiliale, AllocationFamilialePK> {
}
