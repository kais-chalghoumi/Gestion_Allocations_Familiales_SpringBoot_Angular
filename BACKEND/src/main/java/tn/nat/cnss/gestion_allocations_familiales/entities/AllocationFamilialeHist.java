package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ALLOCATION_FAMILIALE_HIST")
public class AllocationFamilialeHist  implements Serializable {

	static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALLFAM_SEQ")
	@SequenceGenerator(sequenceName = "allfamhistseq", allocationSize = 1, name = "ALLFAM_SEQ")
	@Column(name = "ALLFAM_SEQ")
	Long id;

	@Column(name = "BEN_IDUCNSS")
	Integer benIduCnss;

	@Column(name = "ASS_MAT")
	Integer assMat;

	@Column(name = "ASS_CLE")
	Integer assCle;


	@Column(name = "DROIT_ID")
	Integer droitId;

	@Column(name = "DOC_ID")
	String docId;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEB_AF_SU")
	Date dtDeb;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN_AF_SU")
	Date dtFin;

	@Column(name = "RANG_AF")
	Integer rangAf;

	@Column(name = "COMPTE")
	Integer compte;

	@Column(name = "MATAGENT")
	Integer matAgt;

	@Column(name = "BR_AGENT")
	Integer brAgt;

	@Column(name = "NAT_OPR")
	String natOpr;

	//@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OPR")
	Date dateOpr;

}
