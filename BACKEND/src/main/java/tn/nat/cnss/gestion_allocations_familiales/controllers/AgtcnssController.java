package tn.nat.cnss.gestion_allocations_familiales.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.nat.cnss.gestion_allocations_familiales.entities.Agtcnss;
import tn.nat.cnss.gestion_allocations_familiales.services.AgtcnssServicesImpl;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class AgtcnssController {

    @Autowired
    AgtcnssServicesImpl agtcnssServices;

    @GetMapping("/findByIdtMatag/{idtMatag}")
    public Agtcnss findByIdtMatag(@PathVariable("idtMatag") Integer idtMatag) {
        return agtcnssServices.findByIdtMatag(idtMatag);
    }
}
