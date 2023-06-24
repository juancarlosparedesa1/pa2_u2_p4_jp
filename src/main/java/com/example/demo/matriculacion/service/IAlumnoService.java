package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.repository.modelo.Alumno;

public interface IAlumnoService {
	public void agregar(Alumno alumno);

	public Alumno buscar(Integer id);

	public void actualizar(Alumno alumno);

	public void borrar(Integer id);
}
