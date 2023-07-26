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
public class DRENF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    String Num_ass ;
    String Rang_Enf ;
    String Sexe_Enf ;
    String Nat_Enf ;
    String LienPar_Enf ;
    String Piece_Enf ;
    String Date_Nais_Enf ;
    String Date_Dep_Enf ;
    String Date_Fin_Enf ;
    String Prenom_Enf ;
    String Cod_Compte_Trim ;
    String Cod_Droit_SU_Trim ;
    String Cod_Droit_AF_Trim ;
    String Nbr_Jours_Trim ;

}
