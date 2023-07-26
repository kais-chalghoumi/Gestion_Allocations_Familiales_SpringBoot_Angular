package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Assure implements Serializable {

    @EmbeddedId
    Assure_PK ID;
    Integer ASS_DERREG;
    Integer ASS_IU;
    Integer BUR_COD;
    BigDecimal IDUCNSS;
    String NOM;
    String PRENOM;
    Date DATE_NAISSANCE;
    Integer AGE;
    @Enumerated(EnumType.STRING)
    SEXE SEXE;
    String ADRESSE;
    Integer CODE_POSTAL;
    String INFO;
    String MAIL;
    String PHONE;

    @OneToMany(mappedBy = "ASSURE")
    Set<Beneficiaire> beneficiaires ;

    @OneToOne(mappedBy = "ASSURE")
    Compte COMPTE ;

    @OneToMany(mappedBy = "ASSURE")
    Set<Allocation_Familiale> allocation_familiales ;

    @OneToOne(mappedBy = "ASSURE")
    Code_CPT CODE_CPT;
}
