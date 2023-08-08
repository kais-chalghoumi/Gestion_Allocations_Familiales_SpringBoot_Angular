package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MvtDroitEnfantPK implements Serializable {

	static final long serialVersionUID = 1L;
	
	@Column(name = "BEN_IDUCNSS")
	Integer benIduCnss;
	
	@Column(name = "ASS_MAT")
	Integer assMat;	
	
	@Column(name = "ASS_CLE")
	Integer assCle;
	
	@Column(name = "ANNEE")
	Integer annee;
	
	@Column(name = "TRIM")
	Integer trim;

}
