package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	public void guradar(Estudiante estudiante);

	public Estudiante buscar(String cedula);

	public void actualizar(Estudiante estudiante);

	public void borrar(String cedula);
}