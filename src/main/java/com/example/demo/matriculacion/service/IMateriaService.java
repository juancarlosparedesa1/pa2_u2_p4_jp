package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.repository.modelo.Materia;

public interface IMateriaService {
	public void ingresar(Materia materia);

	public Materia buscar(Integer id);

	public void actualizar(Materia materia);

	public void borrar(Integer id);
}
