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
public class RENS1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 13)
    String CLER ;
        @Column(length = 10)
        String MATR ;
        @Column(length = 3)
        String ORDR ;

    @Column(length = 11)
    String ZON1R ;
        @Column(length = 2)
        String CCR ;
        @Column(length = 1)
        String TRR ;
        @Column(length = 2)
        String ANR ;
        @Column(length = 6)
        String SUR ;

    @Column(length = 15)
    String ZON2R ;
        @Column(length = 7)
        String COTR ;
        @Column(length = 5)
        String DATR ;
        @Column(length = 3)
        String JOUR ;

    @Column(length = 4)
    String ASVR ;

    @Column(length = 15)
    String ZON3R ;
        @Column(length = 1)
        String NBEMR ;
        @Column(length = 1)
        String NBESR ;
        @Column(length = 6)
        String AFR ;
        @Column(length = 7)
        String NUMR ;

    @Column(length = 3)
    String LIBR ;
}