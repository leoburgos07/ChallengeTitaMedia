package com.leoburgos07.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.leoburgos07.models.Libro;
import com.leoburgos07.services.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario/libro")
public class LibroController {
    @Autowired
    LibroService libroService;

    @GetMapping
    public ArrayList<Libro> obtenerLibros(){
        return libroService.obtenerLibros();
    }

    @PostMapping
    public Libro guardarLibro(@RequestBody Libro libro){
        return this.libroService.guardarLibro(libro);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Libro> obtenerLibro(@PathVariable("id") Long id){
        return this.libroService.obtenerLibro(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarLibro(@PathVariable("id") Long id){
        boolean res = this.libroService.eliminarLibro(id);
        if(res){
            return "Libro eliminado";
        }else{
            return "No se pudo eliminar el elibro";
        }   
    }
    
}
