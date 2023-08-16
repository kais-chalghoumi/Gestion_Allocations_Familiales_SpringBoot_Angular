package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.nat.cnss.gestion_allocations_familiales.entities.Document;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document,String> {

    @Query("select d.libDocAr from Document d")
    List<String> getAllDocumentLibelles ();


}
