package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.IMateriaRepository;
import com.example.demo.matriculacion.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository materiaRepository;

	@Override
	public void ingresar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(materia);
	}

	@Override
	public Materia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscar(id);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(materia);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(id);
	}
}