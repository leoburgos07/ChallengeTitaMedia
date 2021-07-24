package com.leoburgos07.controllers;

import java.util.*;

import com.leoburgos07.models.User;
import com.leoburgos07.services.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuario")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public ArrayList<User> obtenerUsuarios(){
        return userService.obtenerUsuarios();
    } 

    @PostMapping
    public User guardarUsuario(@RequestBody User usuario){
        return this.userService.guardarUsuario(usuario);
    }
    @GetMapping(path = "/{id}")
    public Optional<User> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.userService.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<User> obtenerUsuariosPorTipo(@RequestParam("userType") String userType){
        return this.userService.obtenerPorUserType(userType);
    } 
    @DeleteMapping(path = "/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id){
        boolean res = this.userService.eliminarUsuario(id);
        if(res){
            return "Usuario eliminado";
        }else{
            return "Error al eliminar el usuario";
        }
    }

}
