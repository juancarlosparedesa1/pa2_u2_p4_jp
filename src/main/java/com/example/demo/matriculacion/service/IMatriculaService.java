package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.repository.modelo.Matricula;

public interface IMatriculaService {
	public void ingresar(Matricula matricula);

	//
	public Matricula buscar(Integer id);

	//
	public void actualizar(Matricula matricula);

	//
	public void borrar(Integer id);
}
