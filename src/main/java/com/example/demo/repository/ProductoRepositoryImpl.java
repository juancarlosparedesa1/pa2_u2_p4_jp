package com.example.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public int eliminarProductoPorfecha(LocalDateTime fechaReferenciaIngreso) {
//		SQL
		// DELETE FROM estudiante WHERE estu_nombre=?
//		jpql
//		DELETE  FROM Estudiante e WHERE e.nombre=:datoNombre
//		eliminar y actualizar se utiliza un tipo de Query
//		el asterisco o el alias?
//		e o el* en el delete no existe el sql
		Query myQuery = this.entityManager
				.createQuery("DELETE  FROM Producto p WHERE p.fechaIngreso<:datofechaReferenciaIngreso");
		myQuery.setParameter("datofechaReferenciaIngreso", fechaReferenciaIngreso);

		return myQuery.executeUpdate();// unico metodo
		// cuando elimino se actualiza la base de datos
		// listado actualizado:algunos ingresan otros eliminan
		// return el numero de registro afectados

	}

}
