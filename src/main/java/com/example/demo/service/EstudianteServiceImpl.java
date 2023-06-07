package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.iEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements iEstudianteService {

	@Autowired
	private iEstudianteRepository estudianteRepository;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}
}
