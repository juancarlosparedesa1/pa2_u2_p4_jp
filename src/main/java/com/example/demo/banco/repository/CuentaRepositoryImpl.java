package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaRepositoryImpl implements ICuentaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, id);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cuenta cuent = this.buscar(id);
		this.entityManager.remove(cuent);

	}

}
