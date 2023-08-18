package tn.nat.cnss.gestion_allocations_familiales.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.nat.cnss.gestion_allocations_familiales.entities.MvtDroitEnfant;
import tn.nat.cnss.gestion_allocations_familiales.services.MvtDroitEnfantServicesImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class MvtDroitEnfantController {

    @Autowired
    MvtDroitEnfantServicesImpl mvtDroitEnfantServices;

    @GetMapping("/getAllById_BenIduCnss/{benIduCnss}")
    public List<MvtDroitEnfant> getAllById_BenIduCnss (@PathVariable("benIduCnss") Integer benIduCnss){
        return mvtDroitEnfantServices.getAllById_BenIduCnss(benIduCnss);
    };
}
