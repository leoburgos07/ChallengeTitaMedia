package com.leoburgos07.repositories;

import com.leoburgos07.models.Libro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long>{
    
}
