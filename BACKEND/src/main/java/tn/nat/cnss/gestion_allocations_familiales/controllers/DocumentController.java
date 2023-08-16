package tn.nat.cnss.gestion_allocations_familiales.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.nat.cnss.gestion_allocations_familiales.services.DocumentServicesImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class DocumentController {

    @Autowired
    DocumentServicesImpl documentServices;

    @GetMapping("/getAllDocumentLibelles")
    List<String> getAllDocumentLibelles (){
        return documentServices.getAllDocumentLibelles();
    }





}
