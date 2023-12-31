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
@Table(name="ASSURE")
public class Assure implements Serializable {

	static final long serialVersionUID = 1L;

	@EmbeddedId
	AssurePK id;
	
	@Column(name="ASS_DERREG")
	Integer assDerreg;
	
	@Column(name="ASS_IU")
	Integer assIu;

}
