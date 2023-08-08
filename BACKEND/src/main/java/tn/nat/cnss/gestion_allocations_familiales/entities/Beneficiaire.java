package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "BENEFICIAIRE")
public class Beneficiaire implements Serializable {

	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BEN_IDUCNSS")
	Integer benIduCnss;
	
	@Column(name = "ASS_MAT")
	Integer assMat;
	
	@Column(name = "ASS_CLE")
	Integer assCle;
	
	@Column(name = "BEN_NOM")
	String benNom;
	
	@Column(name = "BEN_PRENOM")
	String benPrenom;
	
	@Column(name = "BEN_IU")
	Integer benIu;
	
	@Column(name = "BEN_ADR")
	String benAdr;

	@Column(name = "BEN_TYPE")
	Integer benType;

	@Column(name = "BEN_RANG")
	Integer benRang;
}
