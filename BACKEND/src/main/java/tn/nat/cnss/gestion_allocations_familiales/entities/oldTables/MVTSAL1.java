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
public class MVTSAL1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;


    @Column(length = 80)
    String CARTEMS ;

    @Column(length = 29)
    String CLEMS ;
        @Column(length = 10)
        String EMPMS ;
        @Column(length = 2)
        String ANMS ;
        @Column(length = 2)
        String TRMS ;
        @Column(length = 2)
        String CCMS ;
        @Column(length = 4)
        String PAGMS ;
        @Column(length = 2)
        String ORDMS ;
        @Column(length = 2)
        String LIGMS ;
        @Column(length = 5)
        String DATSMS ;

    @Column(length = 5)
    String DATEXMS ;

    @Column(length = 4)
    String OPERMS ;

    @Column(length = 2)
    String BRMS ;

    @Column(length = 1)
    String REGMS ;

    @Column(length = 1)
    String MARQMS ;

    @Column(length = 1)
    String ETATMS ;
}
