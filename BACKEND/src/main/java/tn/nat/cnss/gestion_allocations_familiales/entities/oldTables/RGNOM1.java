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
public class RGNOM1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 10)
    String MATG ;

    @Column(length = 60)
    String IDENTG ;

    @Column(length = 4)
    String CODG ;

    @Column(length = 40)
    String ADRG ;

    @Column(length = 4)
    String CODPG ;

    @Column(length = 20)
    String LOCG ;
}
