package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "profil")
public class Profil implements java.io.Serializable {

	static final long serialVersionUID = -12488413258427000L;

	@Id
	@Column(name = "ID")
	Integer id;

	@Column(name = "LABEL")
	String label;

	@OneToMany(mappedBy = "profil")
	Set<Utilisateur> utilisateurs;
}