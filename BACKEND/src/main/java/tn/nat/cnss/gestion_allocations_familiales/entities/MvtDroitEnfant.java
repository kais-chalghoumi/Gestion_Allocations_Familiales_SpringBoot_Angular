package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "MVT_DROITENFANT")
public class MvtDroitEnfant implements Serializable {

	static final long serialVersionUID = 1L;
	
	@EmbeddedId
	MvtDroitEnfantPK id;
	
	@Column(name = "NB_JOUR")
	Integer nbJour;
	
	@Column(name = "SAL_UNIQUE")
	Integer salUnique;
	
	@Column(name = "DROIT_AF")
	Integer droitAf;
	
	@Column(name = "COMPTE")
	Integer compte;
	
	@Column(name = "RANG_AF")
	Integer rangAf;
	
	@Column(name = "ETAT")
	Integer etat;

}
