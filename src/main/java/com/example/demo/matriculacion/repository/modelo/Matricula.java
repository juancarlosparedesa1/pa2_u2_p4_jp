package com.example.demo.matriculacion.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Matricula {
	@Id
	@GeneratedValue(generator = "seq_matr", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_matr", sequenceName = "seq_matr", allocationSize = 1)
	@Column(name = "matr_id")
	private Integer id;
	@Column(name = "matr_fecha")
	private LocalDateTime fecha;
	@Column(name = "matr_numero")
	private String numero;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="matr_id_alumno")
	private Alumno alumno;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="matr_id_materia")
	private Materia materia;
	
//	SET AND GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	

	
	
}
