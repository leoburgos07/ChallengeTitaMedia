package com.leoburgos07.services;

import java.util.ArrayList;

import com.leoburgos07.dto.ReservaDto;
import com.leoburgos07.models.Reserva;
import com.leoburgos07.repositories.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {
    @Autowired

    ReservaRepository reservaRepository;

    public ArrayList<Reserva> listarReservas(){
        return (ArrayList<Reserva>) reservaRepository.findAll();
    }

    public Reserva guardarReserva(ReservaDto reserva){
        Reserva reservaP = new Reserva();
        reservaP.setDevolucion(reserva.getDevolucion());
        reservaP.setReservarCant(reserva.getReservarCant());
        reservaP.setLibroId(reserva.getLibroId());
        reservaP.setUserId(reserva.getUserId());
        return this.reservaRepository.save(reservaP);
    }
}
