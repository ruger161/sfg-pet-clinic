package de.cegeka.sfgpetclinic.bootstrap;


import de.cegeka.sfgpetclinic.model.Owner;
import de.cegeka.sfgpetclinic.model.Vet;
import de.cegeka.sfgpetclinic.services.OwnerService;
import de.cegeka.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
//    private PetService petService;


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Joshi");
        owner1.setLastName("Lastname");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Dummy");
        owner2.setLastName("McDummy");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Doctor");
        vet1.setLastName("Dogman");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Kastra");
        vet2.setLastName("Fiction");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
