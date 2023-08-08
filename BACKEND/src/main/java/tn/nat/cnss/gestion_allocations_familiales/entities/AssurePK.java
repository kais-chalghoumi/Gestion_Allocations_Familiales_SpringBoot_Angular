package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
public class AssurePK implements Serializable {
	
	static final long serialVersionUID = 1L;

	@Column(name="ASS_MAT")
	Integer assMat;

	@Column(name="ASS_CLE")
	Integer assCle;

}

