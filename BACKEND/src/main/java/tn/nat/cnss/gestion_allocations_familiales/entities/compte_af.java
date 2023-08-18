package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class compte_af implements Serializable {

    @Id
    @Column(name = "CPT_ID")
    Integer CPT_ID;

    @Column(name = "CPT_LBL")
    String CPT_LBL;

    @Column(name = "CPT_LBL_AR")
    String CPT_LBL_AR;
}
