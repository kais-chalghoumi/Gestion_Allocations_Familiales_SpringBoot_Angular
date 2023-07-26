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
public class FICHDT1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 10)
    String MATDT ;

    @Column(length = 10)
    String ZONEDT ;
        @Column(length = 7)
        String MONTDT ;
        @Column(length = 7)
        String TAUXDT ;
        @Column(length = 7)
        String REGLDT ;
}
