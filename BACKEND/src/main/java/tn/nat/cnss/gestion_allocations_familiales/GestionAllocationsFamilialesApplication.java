package tn.nat.cnss.gestion_allocations_familiales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class GestionAllocationsFamilialesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionAllocationsFamilialesApplication.class, args);
    }

}
