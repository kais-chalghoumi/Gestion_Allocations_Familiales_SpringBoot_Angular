package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Allocation_Familiale_Hist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALLFAM_SEQ")
    @SequenceGenerator(sequenceName = "allfamhistseq", allocationSize = 1, name = "ALLFAM_SEQ")
    Long ALLFAM_SEQ;

    BigDecimal BEN_IDUCNSS;
    BigDecimal ASS_MAT;
    BigDecimal ASS_CLE;
    Integer DROIT_ID;
    String DOC_ID;
    @Temporal(TemporalType.DATE)
    Date DATE_DEB_AF_SU;
    @Temporal(TemporalType.DATE)
    Date DATE_FIN_AF_SU;
    Integer RANG_AF;
    Integer COMPTE;
    BigDecimal MATAGENT;
    BigDecimal BR_AGENT;
    String NAT_OPR;
    Date DATE_OPR;
}
