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
public class Allocation_Familiale implements Serializable {

    @EmbeddedId
    Allocation_Familiale_PK id;
    @Temporal(TemporalType.DATE)
    Date DATE_DEB_AF_SU;
    @Temporal(TemporalType.DATE)
    Date DATE_FIN_AF_SU;
    Integer RANG_AF;
    BigDecimal MAT_AGENT;
    BigDecimal BR_AGENT;
    String NAT_OPR;
    @Temporal(TemporalType.DATE)
    Date DATE_OPR;
    Integer DROIT_ID;
    String DOC_ID;

    @ManyToOne
    Assure ASSURE ;

    @ManyToOne
    Lien_Parente LIEN_PARENTE ;

    @OneToOne
    Document_AF Document_AF ;
}
