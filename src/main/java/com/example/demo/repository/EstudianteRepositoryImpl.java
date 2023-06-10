package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

//	private List<Estudiante> baseDatos = new ArrayList<>();

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
//		baseDatos.add(estudiante);
		this.entityManager.persist(estudiante);

	}

	@Override
	public Estudiante buscar(String cedula) {
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void actualizar(Estudiante estudiante) {

		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu = this.buscar(cedula);
		this.entityManager.remove(estu);
	}

}