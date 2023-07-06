package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaService {
	public void ingresar(Matricula matricula);

	public Matricula seleccionar(Integer id);

	public void actualizar(Matricula matricula);

	public void borrar(Integer id);

	public void realizarMatricula(String placa, LocalDateTime fechaMatricula);
}
