package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Agtcnss")
public class Agtcnss implements Serializable {

	static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDT_MATAG")
	Integer idtMatag;

	@Column(name = "CODEBR")
	int codebr;

	@Column(name = "DEP_CODE")
	Integer depCode;

	@Column(name = "DIR_CODE")
	Integer dirCode;

	@Column(name = "DIR_DSG")
	String dirDsg;

	@Column(name = "DIR_DSGAR")
	String dirDsgar;

	@Column(name = "IDT_NOMAG")
	String idtNomag;

	@Column(name = "IDT_PRNAG")
	String idtPrnag;

	@Temporal(TemporalType.DATE)
	@Column(name = "SAG_DATAFF")
	Date sagDataff;

	@Column(name = "SDR_CODE")
	Integer sdrCode;

	@Column(name = "SDR_DSG")
	String sdrDsg;

	@Column(name = "SDR_DSGAR")
	String sdrDsgar;
	
	@Column(name = "IDT_PRNAGAR")
	String idtPrnagar;
	
	@Column(name = "IDT_NOMAGAR")
	String idtNomagar;

}