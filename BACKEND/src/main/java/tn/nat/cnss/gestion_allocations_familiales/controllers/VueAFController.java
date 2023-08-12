package tn.nat.cnss.gestion_allocations_familiales.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.nat.cnss.gestion_allocations_familiales.entities.VueAF;
import tn.nat.cnss.gestion_allocations_familiales.services.VueAFServicesImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class VueAFController {

    @Autowired
    VueAFServicesImpl vueAFServices;

    @GetMapping("/getAllByAssMatOrderByRangBen/{assMat}")
    List<VueAF> getAllByAssMatOrderByRangBen (@PathVariable("assMat") Integer assMat){
        return vueAFServices.getAllByAssMatOrderByRangBen(assMat);
    }
}
