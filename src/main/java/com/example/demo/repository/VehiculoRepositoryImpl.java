package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public Vehiculo seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculo.class, id);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehi = this.seleccionar(id);
		this.entityManager.remove(vehi);
	}

	@Override
	public Vehiculo SeleccionarAnioFabricacion(String anioFabricacion) {
//		 TODO Auto-generated method stub

//		0.contenedor
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

//		1.Especificamos el tipo de retorno
		CriteriaQuery<Vehiculo> myCriteriaQuery = myCriteriaBuilder.createQuery(Vehiculo.class);

//		2.Empezamos a crear el SQL
//		2.1.Defiimos el from(Root) en criteriaApiQuery
		Root<Vehiculo> miTablaFrom = myCriteriaQuery.from(Vehiculo.class);

//		3.Condiciones de mi SQL(Predicados)
		Predicate condicionAnioFabricacion = myCriteriaBuilder.equal(miTablaFrom.get("anioFabricacion"),
				anioFabricacion);

//		4.Aramamos el SQL final

		myCriteriaQuery.select(miTablaFrom).where(condicionAnioFabricacion);

//		5.Ejecucion del Query(typedQuery)
		TypedQuery<Vehiculo> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);

		return myQueryFinal.getSingleResult();
	}

	@Override
	public Vehiculo SeleccionarPorModeloTipoPlacaNumeroSerieDinamico(String modelo, String tipo, String placa,
			String numeroSerie, String anioFabricacion) {
		// TODO Auto-generated method stub

		// desde 0. creo el contenedor
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

//		1.defino el tipo de retorno
		CriteriaQuery<Vehiculo> myCriteriaQuery = myCriteriaBuilder.createQuery(Vehiculo.class);

//		2.Empezamos a crear el Query
//		2.1.Definimos el from(Root)
		Root<Vehiculo> miTablaFrom = myCriteriaQuery.from(Vehiculo.class);
//		3.Cosntruimos las condiciones de mi SQL(predicados)

//		anioFabricacion>2000  v.modelo=? and v.tipo=?  ?:dato que le envio
//		anioFabricion<2000 v.placa=?  or v.numeroSerie=? 
//		Son dos predicados

//		v.modelo=?
		Predicate pModelo = myCriteriaBuilder.equal(miTablaFrom.get("modelo"), modelo);

//		v.tipo=?
		Predicate pTipo = myCriteriaBuilder.equal(miTablaFrom.get("tipo"), tipo);

//		v.placa=?
		Predicate pPlaca = myCriteriaBuilder.equal(miTablaFrom.get("placa"), placa);

//		v.numeroSerie

		Predicate pNumeroSerie = myCriteriaBuilder.equal(miTablaFrom.get("numeroSerie"), numeroSerie);

		int anioInt = Integer.parseInt(anioFabricacion);
		Predicate predicadoFinal = null;
		if (anioInt > 2000) {
			predicadoFinal = myCriteriaBuilder.and(pModelo, pTipo);
		} else {
			if (anioInt < 2000) {
				predicadoFinal = myCriteriaBuilder.or(pPlaca, pNumeroSerie);
			}
		}

//		4.Armamos el Query final
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);

//		5.Ejecucion del Query lo hacemos con typedQuery
		TypedQuery<Vehiculo> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public Vehiculo SeleccionarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa=:datoPlaca");
		myQuery.setParameter("datoPlaca", placa);
		return (Vehiculo) myQuery.getSingleResult();
	}

}
