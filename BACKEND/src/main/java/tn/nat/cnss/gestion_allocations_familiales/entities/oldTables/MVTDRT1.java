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
public class MVTDRT1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 80)
    String CARTEDR ;

    @Column(length = 19)
    String CLEDR ;
        @Column(length = 10)
        String ASSDR ;
        @Column(length = 2)
        String CCDR ;
        @Column(length = 2)
        String ORDDR ;
        @Column(length = 5)
        String DATSDR ;

    @Column(length = 5)
    String DATEXDR ;
    @Column(length = 4)
    String OPERDR ;
    @Column(length = 2)
    String BRDR ;
    @Column(length = 1)
    String REGDR ;
    @Column(length = 1)
    String ETATDR ;
}
