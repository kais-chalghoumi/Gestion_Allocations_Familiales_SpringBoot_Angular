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
@Table(name = "DROIT_DOC_AF")
public class DroitDoc implements Serializable {

	static final long serialVersionUID = 1L;
	
	@EmbeddedId
	DroitDocPK id;

	@Column(name = "DROIT_LBL")
	String libDroit;
	
	@Column(name = "DROIT_LBL_AR")
	String libDroitAr;

}
