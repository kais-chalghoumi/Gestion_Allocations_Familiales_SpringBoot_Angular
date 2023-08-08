package tn.nat.cnss.gestion_allocations_familiales.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {  
    
    static final long serialVersionUID = 1L;  
  
    String firstname;  
    String lastname;  
    Integer age;  
    String street;  
    String city;  
    String postalCode;  
    String info;  
    String email;  
    String phone;  

}  
