package tn.nat.cnss.gestion_allocations_familiales.entities.newTables;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DRTUT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    String Mat_Tut; //matricule avec code compte
    String Matr_Tut1 ; //matricule reel du tuteur (cpt=0)
    String Date_Creat ; //date de creation

}
