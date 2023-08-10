package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.Utilisateur;
import tn.nat.cnss.gestion_allocations_familiales.repositories.UtilisateurRepository;

@Slf4j
@Service
public class UtilisateurServicesImpl implements UtilisateurServicesInterface {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur findByLoginAndPwd(Integer login, String pwd) {
        return utilisateurRepository.findByLoginAndPwd(login,pwd);
    }
}
