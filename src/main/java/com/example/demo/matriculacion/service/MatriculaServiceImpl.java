package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.IMatriculaRepository;
import com.example.demo.matriculacion.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Override
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(id);
	}

}
