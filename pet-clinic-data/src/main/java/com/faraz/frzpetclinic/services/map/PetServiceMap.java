package com.faraz.frzpetclinic.services.map;

import com.faraz.frzpetclinic.models.Pet;
import com.faraz.frzpetclinic.services.CrudService;
import com.faraz.frzpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }
}
