package tn.nat.cnss.gestion_allocations_familiales.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.nat.cnss.gestion_allocations_familiales.entities.Utilisateur;
import tn.nat.cnss.gestion_allocations_familiales.services.UtilisateurServicesImpl;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class UtilisateurController {

    @Autowired
    UtilisateurServicesImpl utilisateurServices;

    @GetMapping("/findByLoginAndPwd/{login}/{pwd}")
    public Utilisateur findByLoginAndPwd(@PathVariable("login") Integer login, @PathVariable("pwd")  String pwd){
        return utilisateurServices.findByLoginAndPwd(login,pwd);
    }
}
