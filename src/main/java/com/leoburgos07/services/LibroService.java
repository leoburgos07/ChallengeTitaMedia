package com.leoburgos07.services;

import java.util.ArrayList;
import java.util.Optional;

import com.leoburgos07.models.Libro;
import com.leoburgos07.repositories.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    
    @Autowired
    LibroRepository libroRepository;

    public ArrayList<Libro> obtenerLibros(){
        return (ArrayList<Libro>) libroRepository.findAll();
    }

    public Libro guardarLibro(Libro libro){
        return libroRepository.save(libro);
    }

    public Optional <Libro> obtenerLibro(Long id){
        return libroRepository.findById(id);
    }
    public boolean eliminarLibro(Long id){
        try {
            libroRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
