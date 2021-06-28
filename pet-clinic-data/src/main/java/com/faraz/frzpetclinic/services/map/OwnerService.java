package com.faraz.frzpetclinic.services.map;

import com.faraz.frzpetclinic.models.Owner;
import com.faraz.frzpetclinic.services.CrudService;

import java.util.Set;

public class OwnerService extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }
}
