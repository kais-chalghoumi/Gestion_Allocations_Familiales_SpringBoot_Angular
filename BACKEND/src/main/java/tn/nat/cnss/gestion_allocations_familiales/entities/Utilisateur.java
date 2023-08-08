package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "user_af")
public class Utilisateur  implements Serializable {
	
	static final long serialVersionUID = 8164397046397876503L;

	@Id
	@Column(name = "login", unique = true, nullable = false)
	Integer login;

	@Column(name = "email", nullable = false, length = 50)
	String	email;

	@Column(name = "nom", nullable = false, length = 50)
	String	nom;

	@Column(name = "pwd", nullable = false, length = 50)
	String	pwd;

	@ManyToOne(fetch = FetchType.EAGER)
	Profil profil ;

//	@Transient
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		List<GrantedAuthority> autorites = new ArrayList<GrantedAuthority>();
//		autorites.add(new SimpleGrantedAuthority("ROLE_DEFAULT"));
//		return autorites;
//	}

}