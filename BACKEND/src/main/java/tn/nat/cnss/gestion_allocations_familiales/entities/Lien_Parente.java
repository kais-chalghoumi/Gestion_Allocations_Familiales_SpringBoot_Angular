package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Lien_Parente implements Serializable {

    @Id
    Integer LIEN_PAR_ID ;
    String LIEN_PAR_LBL_FR ;
    String LIEN_PAR_LBL_AR ;

    @OneToMany
    Set<Allocation_Familiale> ALLOCATION_FAMILIALE ;
}
