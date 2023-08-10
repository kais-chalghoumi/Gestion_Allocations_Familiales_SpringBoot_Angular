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
@Table(name = "USERAGT")
public class UserAgt implements Serializable {

	static final long serialVersionUID = 1L;
    
	@Id
	@Column(name = "LOGIN")
	Integer login;
	
	@Column(name = "NOM")
	String ident;
	
	@Column(name = "PROFIL_ID")
	Integer profil;
	
	@Column(name = "CODEBR")
	Integer br;
	 
	@Column(name = "DIR_DSG")
	String bureau;
	
	@Column(name = "IDENT_AR")
	String identAr;
}
