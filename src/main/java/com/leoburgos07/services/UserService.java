package com.leoburgos07.services;

import java.util.ArrayList;
import java.util.Optional;

import com.leoburgos07.models.User;
import com.leoburgos07.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<User> obtenerUsuarios(){
        return (ArrayList<User>) (userRepository.findAll());
        
    }

    public User guardarUsuario(User usuario){
        return userRepository.save(usuario);
    }

    public Optional<User> obtenerPorId(Long id){
            return userRepository.findById(id);
    }

    public ArrayList<User> obtenerPorUserType(String type){
        return userRepository.findByUserType(type);
    }

    public boolean eliminarUsuario(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
