package com.faraz.frzpetclinic.services;

import com.faraz.frzpetclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
