package com.example.demo.repository;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaRepository {
	public void insertar(Matricula matricula);

	public Matricula seleccionar(Integer id);

	public void actualizar(Matricula matricula);

	public void eliminar(Integer id);
}
