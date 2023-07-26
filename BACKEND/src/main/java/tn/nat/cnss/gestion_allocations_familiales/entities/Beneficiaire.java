package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Beneficiaire implements Serializable {

    @Id
    private BigDecimal IDUCNSS;
    private BigDecimal ASS_MAT;
    private BigDecimal ASS_CLE;
    private String NOM;
    private String PRENOM;
    private BigDecimal IU;
    private String ADRESSE ;
    private Integer TYPE;
    private Integer RANG;

    @ManyToOne
    Assure ASSURE ;
}
