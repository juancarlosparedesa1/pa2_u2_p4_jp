package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	public void guardar(Estudiante estudiante);

	public Estudiante buscar(String cedula);

	public void actualizar(Estudiante estudiante);

	public void borrar(String cedula);

	public Estudiante buscarPorApellido(String apellido);

	public List<Estudiante> reporte(String apellido);

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