package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaService {
	public void ingresar(Matricula matricula);

	public Matricula seleccionar(Integer id);

	public void actualizar(Matricula matricula);

	public void borrar(Integer id);

	public void realizarMatricula(String placa, BigDecimal costo, LocalDateTime fechaMatricula);
}
