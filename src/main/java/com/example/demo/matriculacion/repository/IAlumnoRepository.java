package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.repository.modelo.Alumno;

public interface IAlumnoRepository {

	public void insertar(Alumno alumno);

	public Alumno buscar(Integer id);

	public void actualizar(Alumno alumno);

	public void eliminar(Integer id);
}