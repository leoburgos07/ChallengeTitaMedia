package com.leoburgos07.dto;

import java.sql.Date;

import com.leoburgos07.models.Libro;
import com.leoburgos07.models.User;

public class ReservaDto {

	private Date devolucion;

	private Integer reservarCant;

	private Libro libroId;

	private User userId;

	public Date getDevolucion() {
		return devolucion;
	}

	public void setDevolucion(Date devolucion) {
		this.devolucion = devolucion;
	}

	public Integer getReservarCant() {
		return reservarCant;
	}

	public void setReservarCant(Integer reservarCant) {
		this.reservarCant = reservarCant;
	}

	public Libro getLibroId() {
		return libroId;
	}

	public void setLibroId(Libro libroId) {
		this.libroId = libroId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	

}
