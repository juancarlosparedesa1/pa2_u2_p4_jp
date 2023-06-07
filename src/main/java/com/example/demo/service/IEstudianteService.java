package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	public void guradar(Estudiante estudiante);

	public Estudiante buscar(Integer id);

	public void actualizar(Estudiante estudiante);

	public void borrar(Integer id);

}
