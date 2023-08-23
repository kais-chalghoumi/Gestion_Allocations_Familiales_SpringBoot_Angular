package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ALLOCATION_FAMILIALE")
public class AllocationFamiliale implements Serializable {
	
	static final long serialVersionUID = 1L;
	
	@EmbeddedId
	AllocationFamilialePK id;
	
	@Column(name = "DROIT_ID")
	Integer droitId;
	
	@Column(name = "DOC_ID")
	String docId;
	
	@Column(name = "DATE_DEB_AF_SU")
	LocalDate dtDeb;
	
	@Column(name = "DATE_FIN_AF_SU")
	LocalDate dtFin;
	
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
	
	@Column(name = "DATE_OPR")
	LocalDate dateOpr;
	

}
