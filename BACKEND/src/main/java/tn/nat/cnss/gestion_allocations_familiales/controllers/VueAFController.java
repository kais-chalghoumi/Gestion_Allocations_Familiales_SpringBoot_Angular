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

    @GetMapping("/findByBenIduCnss/{benIduCnss}")
    VueAF findByBenIduCnss (@PathVariable("benIduCnss") Integer benIduCnss){
        return vueAFServices.findById(benIduCnss);
    }

    @PostMapping("/updateVueAF/{benIduCnss}")
    VueAF updateVueAF (@RequestBody VueAF vueAF,@PathVariable("benIduCnss") Integer benIduCnss){
        return vueAFServices.updateVueAF(vueAF,benIduCnss);
    }
}
