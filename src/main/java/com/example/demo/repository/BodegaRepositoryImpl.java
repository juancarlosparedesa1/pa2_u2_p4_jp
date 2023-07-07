package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepositoryImpl implements IBodegaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insetar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);

	}

	@Override
	public int actualizarUbicacion(String numeroBodega, String nuevaUbicacion) {
		Query query = entityManager
				.createQuery("UPDATE Bodega b SET b.ubicacion = :nuevaUbicacion WHERE b.numero = :numeroBodega");
		query.setParameter("nuevaUbicacion", nuevaUbicacion);
		query.setParameter("numeroBodega", numeroBodega);

		return query.executeUpdate();
	}

}
