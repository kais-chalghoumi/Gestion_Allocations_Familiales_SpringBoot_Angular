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
public class ECIV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 7)
    String NAISV ;

    @Column(length = 1)
    String SEXV ;

    @Column(length = 9)
    String CONTV ;

    @Column(length = 10)
    String MATV ;

    @Column(length = 17)
    String SITASSV ;
    @Column(length = 6)
    String DATEFFV ;
    @Column(length = 6)
    String DATDCV ;
    @Column(length = 1)
    String SITFV ;
    @Column(length = 1)
    String NATV ;
    @Column(length = 1)
    String SUSV ;
    @Column(length = 2)
    String CATV ;

    @Column(length = 13)
    String SITCJTV ;
    @Column(length = 10)
    String MATCJTV ;
    @Column(length = 3)
    String ACTV ;
}
