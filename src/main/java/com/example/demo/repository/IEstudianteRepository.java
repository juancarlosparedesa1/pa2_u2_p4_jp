package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	// CRUD
	public void insertar(Estudiante estudiante);

	public Estudiante buscar(String cedula);

	public void actualizar(Estudiante estudiante);

	public void eliminar(String cedula);

	public Estudiante seleccionarPorApellido(String apellido);

	// vartios estudiante
	public List<Estudiante> seleccionarListaPorApellido(String apellido);

	// apellido y nombre
	public Estudiante SeleccionarPorApellidoyNombre(String apellido, String nombre);

	public Estudiante seleccionarPorApellidoTyped(String apellido);

	public Estudiante buscaPorApellidoNamed(String apellido);

	public Estudiante buscaPorApellidoNamedQuery(String apellido);

	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);

	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);

	public Estudiante buscaPorNombreNamedQuery(String nombre);

	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);

	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido);

}