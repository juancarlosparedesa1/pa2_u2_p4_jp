package com.example.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Matricula.class, id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(matricula);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Matricula matr = this.buscar(id);
		this.entityManager.remove(matr);
	}
}