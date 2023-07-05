package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(cedula);

	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> reporte(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarListaPorApellido(apellido);

	}

	@Override
	public Estudiante SeleccionarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.SeleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Estudiante buscaPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscaPorApellidoNamed(apellido);
	}

	@Override
	public Estudiante buscaPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscaPorApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoNativeQuery(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoNativeQueryNamed(apellido);
	}

	@Override
	public Estudiante buscaPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscaPorNombreNamedQuery(nombre);
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorNombreNativeQueryNamed(nombre);
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int borrarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.eliminarPorNombre(nombre);
	}

	@Override
	public int actualizarPorApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.actualizarPorApellido(nombre, apellido);
	}

}