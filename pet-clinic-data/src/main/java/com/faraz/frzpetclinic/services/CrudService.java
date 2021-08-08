package com.faraz.frzpetclinic.services;


import java.util.Set;

public interface CrudService<T, ID> {
    T findById(ID id);

    T save(T t);

    Set<T> findAll();

    void delete(T t);

    void deleteByID(ID id);
}
