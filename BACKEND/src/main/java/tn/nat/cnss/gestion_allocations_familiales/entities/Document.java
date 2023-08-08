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
@Table(name = "DOCUMENT_AF")
public class Document implements Serializable {

	static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "DOC_ID")
	String idDoc;
	
	@Column(name = "DOC_LBL")
	String libDoc;
	
	@Column(name = "DOC_LBL_AR")
	String libDocAr;

}
