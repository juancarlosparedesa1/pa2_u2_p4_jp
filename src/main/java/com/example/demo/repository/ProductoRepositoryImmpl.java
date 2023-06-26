package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImmpl implements IProductoRespository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Producto prod = this.buscar(id);
		this.entityManager.remove(prod);
	}

//	*********************************QUERYS*************************************

//	--------------QUERYS-------------
	@Override
	public Producto buscarPorNombreQuerySingleResult(String nombre) {
		// TODO Auto-generated method stub

//		SQL
//		SELECT * FROM estudiante e WHERE e.estu_apellido=
//		JPQL
//		"SELECT e FROM Estudiante e WHERE e.nombre=:datoApellido" 

		Query myQuery = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.nombre=:datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Producto) myQuery.getSingleResult();
	}

	@Override
	public List<Producto> buscarPorCodigoBarrasResulList(String CodigoBarras) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.codigoBarras=:datoCodigo");
		myQuery.setParameter("datoCodigo", CodigoBarras);
		return myQuery.getResultList();
	}

	@Override
	public List<Producto> BuscarPorNombreCodigoBarras(String nombre, String codigoBarras) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery(
				"SELECT p FROM Producto p WHERE p.nombre=:datoNombre AND p.codigoBarras=:datoCodigoBarras");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoCodigoBarras", codigoBarras);
		return myQuery.getResultList();
	}

	@Override
	public List<Producto> buscarPorPrecioQuery(BigDecimal precioLimite) {
		// TODO Auto-generated method stub

		Query myQuery = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.precio>:precioLimite");
		myQuery.setParameter("precioLimite", precioLimite);
		return myQuery.getResultList();
	}

//	----------------TYPED QUERYS----------------
	@Override
	public Producto buscarPorNombreSingleResultTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> myQuery = this.entityManager
				.createQuery("SELECT p FROM Producto p WHERE p.nombre=:datoNombre", Producto.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Producto> buscarPorCodigoBarrasResultListTypedQuery(String CodigoBarras) {
		// TODO Auto-generated method stub

		TypedQuery<Producto> myQuery = this.entityManager
				.createQuery("SELECT p FROM Producto p WHERE p.codigoBarras=:datoCodigo", Producto.class);
		myQuery.setParameter("datoCodigo", CodigoBarras);
		return myQuery.getResultList();
	}

}
