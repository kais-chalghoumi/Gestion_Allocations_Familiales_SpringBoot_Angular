package tn.nat.cnss.gestion_allocations_familiales.services;

import tn.nat.cnss.gestion_allocations_familiales.entities.AllocationFamilialeHist;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;
import java.util.Date;

public interface AllocationFamilialeHistServicesInterface {

    AllocationFamilialeHist addAllocationFamilialeHist(Integer benIduCnss, Integer assMat, Integer assCle, Integer droitId, String docId, LocalDate dtDeb, LocalDate dtFin, Integer rangAf, Integer compte, Integer matAgt, Integer brAgt, String natOpr, LocalDate dateOpr);
}
