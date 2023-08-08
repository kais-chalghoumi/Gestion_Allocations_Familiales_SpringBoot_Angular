package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

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
@Table(name="Vue11ad")
public class Vue11ad implements Serializable{

	static final long serialVersionUID = 1L;
	
	@Id		
	@Column(name="ASS_MAT")
	Integer assMat;
	
	@Column(name="ASS_CLE")
	Integer assCle;
	
	@Column(name = "ANNEE")
	Integer annee;
	
	@Column(name = "TRIM")
	Integer trim;
	
	@Column(name = "nbj_rg1")
	Integer nbj1;
	
	@Column(name = "salun_rg1")
	Integer salun1;
	
	@Column(name = "droit_rg1")
	Integer drt1;
	
	@Column(name = "compte_rg1")
	Integer cat1;
	
	@Column(name = "nbj_rg2")
	Integer nbj2;
	
	@Column(name = "salun_rg2")
	Integer salun2;
	
	@Column(name = "droit_rg2")
	Integer drt2;
	
	@Column(name = "compte_rg2")
	Integer cat2;
	
	@Column(name = "nbj_rg3")
	Integer nbj3;
	
	@Column(name = "salun_rg3")
	Integer salun3;
	
	@Column(name = "droit_rg3")
	Integer drt3;
	
	@Column(name = "compte_rg3")
	Integer cat3;

}
