package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mvt_Droit_Enfant implements Serializable {

    @EmbeddedId
    Mvt_Droit_Enfant_PK id;
    Integer NB_JOUR;
    Integer SAL_UNIQUE;
    Integer DROIT_AF;
    Integer COMPTE;
    Integer RANG_AF;
    Integer ETAT;
}
