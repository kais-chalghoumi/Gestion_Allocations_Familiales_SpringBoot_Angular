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
@Table(name = "DROIT_AF")
public class Droit implements Serializable {

	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DROIT_ID")
	Integer idDroit;
	
	@Column(name = "DROIT_LBL")
	String libDroit;
	
	@Column(name = "DROIT_LBL_AR")
	String libDroitAr;

}
