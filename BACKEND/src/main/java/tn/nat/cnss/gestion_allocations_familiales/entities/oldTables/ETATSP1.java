package tn.nat.cnss.gestion_allocations_familiales.entities.oldTables;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ETATSP1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 8)
    String EMP ;
}
