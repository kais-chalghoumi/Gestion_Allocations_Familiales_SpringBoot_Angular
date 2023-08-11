package tn.nat.cnss.gestion_allocations_familiales.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.nat.cnss.gestion_allocations_familiales.entities.Vassure;
import tn.nat.cnss.gestion_allocations_familiales.services.VassureServicesImpl;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class VassureController {

    @Autowired
    VassureServicesImpl vassureServices;

    @GetMapping("/findByAssMatAndAssCle/{assMat}/{assCle}")
    public Vassure findByAssMatAndAssCle(@PathVariable("assMat") Integer assMat, @PathVariable("assCle")  Integer assCle){
        return vassureServices.findByAssMatAndAssCle(assMat,assCle);
    }
}
