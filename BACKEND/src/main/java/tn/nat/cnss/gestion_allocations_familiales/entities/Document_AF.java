package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Document_AF implements Serializable {

    @Id
    String DOC_ID;
    String DOC_LBL;
    String DOC_LBL_AR;

    @OneToOne(mappedBy = "Document_AF")
    Allocation_Familiale Allocation_Familiale ;

    @ManyToMany(mappedBy = "Documents_AF")
    Set<Droit_AF> Droits_AF ;
}
