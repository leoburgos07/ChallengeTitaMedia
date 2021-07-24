package com.leoburgos07.models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

// import com.fasterxml.jackson.annotation.JsonFormat;
// import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "reservas")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long id;

	@Column(nullable = false)
	private Date devolucion;

	@Column(name = "reservar_cant", nullable = false)
	private Integer reservarCant;

	@ManyToOne
	@JoinColumn(name = "libro_id", nullable = false)
	private Libro libroId;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User userId;

	@CreationTimestamp
	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@UpdateTimestamp
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
