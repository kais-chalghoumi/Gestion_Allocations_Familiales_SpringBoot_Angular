package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "VUE_AF")
public class VueAF implements Serializable {

	static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "BEN_IDUCNSS")
	Integer benIduCnss;
	
	@Column(name = "BEN_NOM")
	String benNom;
	
	@Column(name = "BEN_PRENOM")
	String benPrenom;
	
	@Column(name = "ASS_MAT")
	Integer assMat;
	
	@Column(name = "ASS_CLE")
	Integer assCle;
	
	@Column(name = "BEN_DTNAIS")
	LocalDate benDtnais;
	
	@Column(name = "DROIT")
	Integer droit;
	
	@Column(name = "DATEDB")
	LocalDate dateDB;

	@Column(name = "DATEFIN")
	LocalDate dateFin;
	
	@Column(name = "RANGBEN")
	Integer rangBen;
	
	@Column(name = "COMPTE")
	Integer compte;
	
	@Column(name = "DOCBEN")
	String docBen;

//	@OneToMany(mappedBy = "vueAF")
//	List<MvtDroitEnfant> mvtDroitEnfantList;

}
