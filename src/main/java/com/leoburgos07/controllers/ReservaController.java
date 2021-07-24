package com.leoburgos07.controllers;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.leoburgos07.dto.ReservaDto;
import com.leoburgos07.models.Reserva;
import com.leoburgos07.services.ReservaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario/reserva")
public class ReservaController {
    @Autowired
    ReservaService reservaService;

    @GetMapping
    public ArrayList<Reserva> listarReservas(){
        return reservaService.listarReservas();
    }

    @PostMapping
    public Reserva guardarReserva(@RequestBody ReservaDto reserva){
        //System.out.println(new Gson().toJson(reserva));
       return reservaService.guardarReserva(reserva);
    //return null;
    }
}
