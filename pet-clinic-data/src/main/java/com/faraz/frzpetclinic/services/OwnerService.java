package com.faraz.frzpetclinic.services;

import com.faraz.frzpetclinic.models.Owner;


public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
