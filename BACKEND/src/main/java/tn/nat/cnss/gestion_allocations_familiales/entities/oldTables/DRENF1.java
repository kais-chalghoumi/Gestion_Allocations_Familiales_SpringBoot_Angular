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
public class DRENF1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 9)
    String RAC_ORD ;
    @Column(length = 8)
    String RACD ;
    @Column(length = 1)
    String ORD ;

    @Column(length = 2)
    String PROCHD ;

    @Column(length = 5)
    String ZONID ;
    @Column(length = 2)
    String RANGD ;
    @Column(length = 1)
    String SEXED ;
    @Column(length = 1)
    String NATD ;
    @Column(length = 1)
    String LIEND ;

    @Column(length = 1)
    String PIECD ;

    @Column(length = 10)
    String ZON2D ;
    @Column(length = 18)
    String NAISD ;
    @Column(length = 6)
    String DEPD ;
    @Column(length = 6)
    String FIND ;

    @Column(length = 15)
    String ZON3D ;
    @Column(length = 5)
    String SITD ;
    @Column(length = 1)
    String CPTD ;
    @Column(length = 1)
    String DRTSUD ;
    @Column(length = 1)
    String DRTAFD ;
    @Column(length = 2)
    String NBRJD ;

    @Column(length = 14 )
    String PREND ;

}
