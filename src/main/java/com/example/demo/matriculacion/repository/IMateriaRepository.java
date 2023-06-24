package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.repository.modelo.Materia;

public interface IMateriaRepository {
	public void insertar(Materia materia);

	public Materia buscar(Integer id);

	public void actualizar(Materia materia);

	public void eliminar(Integer id);
}
