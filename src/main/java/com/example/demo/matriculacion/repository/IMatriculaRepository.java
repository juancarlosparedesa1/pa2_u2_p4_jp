package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.repository.modelo.Matricula;

public interface IMatriculaRepository {
	public void insertar(Matricula matricula);

	public Matricula buscar(Integer id);

	public void actualizar(Matricula matricula);

	public void eliminar(Integer id);
}
