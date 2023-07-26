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
public class DRALL1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 9)
    String MATA ;
        @Column(length = 8)
        String RACA;
        @Column(length = 1)
        String CPTA;

    @Column(length = 1)
    String PROCHA;

    @Column(length = 11)
    String ZONEA ;
        @Column(length = 6)
        String AFA ;
        @Column(length = 5)
        String SUA ;
}
