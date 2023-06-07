package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	// CRUD
	public void insertar(Estudiante estudiante);

	public Estudiante buscar(Integer id);

	public void actualizar(Estudiante estudiante);

	public void eliminar(Integer id);

}
