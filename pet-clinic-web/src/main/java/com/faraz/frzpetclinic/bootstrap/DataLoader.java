package com.faraz.frzpetclinic.bootstrap;

import com.faraz.frzpetclinic.models.Owner;
import com.faraz.frzpetclinic.models.Vet;
import com.faraz.frzpetclinic.services.OwnerService;
import com.faraz.frzpetclinic.services.VetService;
import com.faraz.frzpetclinic.services.map.OwnerServiceMap;
import com.faraz.frzpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Faraz");
        owner1.setLastName("Noor");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Maria");
        owner2.setLastName("Noor");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Gajodhar");
        vet1.setLastName("Chauhan");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ram");
        vet2.setLastName("Dayal");

        vetService.save(vet2);
        System.out.println("Loaded Vets");

    }
}
