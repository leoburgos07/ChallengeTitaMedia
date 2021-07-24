package com.leoburgos07.repositories;

import java.util.ArrayList;

import com.leoburgos07.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

   public abstract ArrayList<User> findByUserType(String type); 
    
    
}
