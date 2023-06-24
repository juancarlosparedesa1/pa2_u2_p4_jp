package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.IAlumnoRepository;
import com.example.demo.matriculacion.repository.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

	@Autowired
	private IAlumnoRepository alumnoRepository;

	@Override
	public void agregar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.insertar(alumno);
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.alumnoRepository.buscar(id);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.actualizar(alumno);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.alumnoRepository.eliminar(id);
	}
}