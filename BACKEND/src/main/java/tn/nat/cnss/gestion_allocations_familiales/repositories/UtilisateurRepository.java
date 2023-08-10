package tn.nat.cnss.gestion_allocations_familiales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.nat.cnss.gestion_allocations_familiales.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

    Utilisateur findByLoginAndPwd (Integer login,String	pwd);
}
