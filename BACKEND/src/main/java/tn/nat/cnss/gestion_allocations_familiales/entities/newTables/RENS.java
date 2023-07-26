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
public class RENS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    String Num_Ass ; // numero assure/tuteur
    String Code_Carte ; //code carte
    String Trimestre_Annee ; // trimestre/annee
    String Libelle ; //libelle mondat
    String Mont_AF_Mondat ; // montant AF
    String Mont_SU_Mondat ; // Montant SU
    String Date_Mondat ; //date d'emission du mondat
    String Num_Mondat ; //numero du mondat
    String Num_Cot ; // nombre employeurs
    String Nbre_Jours ; //nombre du jours
    String Nbre_EM ; //nombre d'enfants
    String Nbre_ES ; //nombre d'enfants suspendus
    String ASVR ; //renseignement
}