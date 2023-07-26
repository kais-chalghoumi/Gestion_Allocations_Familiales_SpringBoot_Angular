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
public class DRTUT1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID ;

    @Column(length = 10)
    String MATT ;

    @Column(length = 10)
    String MATTUT ;

    @Column(length = 6)
    String DATD ;

}
