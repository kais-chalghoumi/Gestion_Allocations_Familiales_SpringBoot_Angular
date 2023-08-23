package tn.nat.cnss.gestion_allocations_familiales.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.nat.cnss.gestion_allocations_familiales.entities.Document;
import tn.nat.cnss.gestion_allocations_familiales.repositories.DocumentRepository;

import java.util.List;

@Slf4j
@Service
public class DocumentServicesImpl implements DocumentServicesInterface{

    @Autowired
    DocumentRepository documentRepository;

    @Override
    public List<String> getAllDocumentLibellesByAge (Integer age) {
        return documentRepository.getAllDocumentLibellesByAge(age);
    }


}
