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
public class DRSAL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    String Num_Ass ; //Numero assuré (cpt=0)
    String Num_Empl_Trim ; //Numero Employe
    String Salaire_Trim ; //Salaire Trim (declare+assim)
}
