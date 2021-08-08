package com.faraz.frzpetclinic.services.map;

import com.faraz.frzpetclinic.models.Vet;
import com.faraz.frzpetclinic.services.CrudService;
import com.faraz.frzpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }
}
