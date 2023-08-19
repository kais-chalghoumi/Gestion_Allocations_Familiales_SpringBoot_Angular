package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamiliale;
import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamilialePK;

@Repository
public interface AllocationFamilialeRepository extends JpaRepository<AllocationFamiliale, AllocationFamilialePK> {

    @Query("select a from AllocationFamiliale a where a.id.benIduCnss =:benIduCnss and a.id.assMat =:assMat and a.id.assCle =:assCle")
    AllocationFamiliale findById(@Param("benIduCnss") Integer benIduCnss,@Param("assMat") Integer assMat,@Param("assCle") Integer assCle);
}
