package tn.nat.cnss.gestion_allocations_familiales.services;

import tn.nat.cnss.gestion_allocations_familiales.entities.Utilisateur;

import java.util.List;

public interface UtilisateurServicesInterface {

    public Utilisateur findByLoginAndPwd (Integer login,String	pwd);
}
