package tn.nat.cnss.gestion_allocations_familiales.entities.newTables;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RGRAP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;
    String Nat_Ass ;
    String Trimestre_Annee ;
    String Mont_Cred ;
    String Date_Cred ;
    String Mont_deb ;
    String Date_deb ;
    String Nb_Jours ;
    String Nb_EM ;
    String Nb_ES ;
    String ASVR ;
}
