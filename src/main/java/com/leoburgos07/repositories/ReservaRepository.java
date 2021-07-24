package com.leoburgos07.repositories;

import com.leoburgos07.models.Reserva;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Long>{
    
}
