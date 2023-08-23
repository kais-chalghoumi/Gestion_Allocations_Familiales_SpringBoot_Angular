package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="Vassure")
public class Vassure implements Serializable {

	static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ASS_MAT")
	Integer assMat;
	
	@Column(name="ASS_CLE")
	Integer assCle;
	
	@Column(name="MATRICULE")
	Integer matricule;
	
	@Column(name="BEN_NOM")
	String assNom;
	
	@Column(name="BEN_PRENOM")
	String assPrenom;
	
	@Column(name="BEN_DTNAIS")
	LocalDate assDtnais;
	
	@Column(name="BUR_COD")
	Integer burCod;
	
	@Column(name="ASS_IU")
	Integer assIu;
	
	@Column(name="BEN_IDUCNSS")
	Integer benIdu;
	
	@Column(name="ASS_DERREG")
	Integer assDerreg;
	
	
	@Column(name="LOC_CODPOS")
	Integer codpos;
 
	
	@Column(name="ADR_DESVOI")
	String adresse;

}
