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
public class AgtCNSS implements Serializable {

    @Id
    BigDecimal IDT_MATAG;
    int CODEBR;
    BigDecimal DEP_CODE;
    BigDecimal DIR_CODE;
    String DIR_DSG;
    String DIR_DSGAR;
    String IDT_NOMAG;
    String IDT_PRNAG;
    @Temporal(TemporalType.DATE)
    Date SAG_DATAFF;
    BigDecimal SDR_CODE;
    String SDR_DSG;
    String SDR_DSGAR;
    String IDT_PRNAGAR;
    String IDT_NOMAGAR;

    @OneToOne(mappedBy = "AgtCNSS")
    Profil profil;
}
