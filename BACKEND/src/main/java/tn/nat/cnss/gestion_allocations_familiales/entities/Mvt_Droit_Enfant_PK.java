package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
public class Mvt_Droit_Enfant_PK implements Serializable {

    BigDecimal BEN_IDUCNSS;
    BigDecimal ASS_MAT;
    Integer ASS_CLE;
    Integer ANNEE;
    Integer TRIM;
}
