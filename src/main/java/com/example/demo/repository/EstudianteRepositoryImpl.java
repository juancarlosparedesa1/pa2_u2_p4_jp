package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

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

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
//		SQL
//		"SELECT * FROM estudiante  WHERE estu_apellido=:datoApellido"
//		JPQL
//		SELECT e (alias) FROM Estudiante(nombre de la clase) e(alias) WHERE e.(nombre atributo apeellido).apellido
//		SELECT e FROM Estudiante e WHERE e.apellido=:datoApellido(se convierte en una variable y en algun momento va a ser llenada y sera reemplazada por el dato que viene)

//		Query myQuery = this.entityManager.createQuery("JPQL");
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido=:datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();// retorname un unico resultado
		// tengo que realizar un cast porque no especifico quiery

	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido=:datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();// retorname un unico resultado
	}

	@Override
	public Estudiante SeleccionarPorApellidoyNombre(String apellido, String nombre) {
		Query myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido=:datoApellido AND e.nombre=:datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();// retorname un unico resultado
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {

		// interactuar con la bd this.entityManager.createQuery("JPQL",
		// Estudiante.class);
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido=:datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		// TODO Auto-generated method stub
		return myQuery.getSingleResult();

	}

	@Override
	public Estudiante buscaPorApellidoNamed(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido",
				Estudiante.class);

		myQuery.setParameter("datoApellido", apellido);

		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscaPorApellidoNamedQuery(String apellido) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido", Estudiante.class);

		myQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createNativeQuery("SELECT * FROM estudiante  WHERE estu_apellido=:datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoNative",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscaPorNombreNamedQuery(String nombre) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorNombre", Estudiante.class);

		myQuery.setParameter("datoNombre", nombre);

		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido) {
		// TODO Auto-generated method stub
		// debemos declarar una interfaz criteria builder
//		construye desde 0 metodo a metodo
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();// mi objeto que me va a permitir crear

		// 1.Especificamos el tipo de retorno que tiene mi Query
		// simil con el typedQuery
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);
		// 2.Empezamos a crear el SQL
//		2.1 Definimos el FROM (Root) en CAQ
//		en este caso el from y el root es el mismo
//		El from y el retorno es el mismo
//		una parte de mi sql From
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);
//		3.Construir las condiciones de mi SQL(las condiciones se les conoce como predicados en CriteriaApiQuery)
//		cada condicion es un predicado
//		1 condicion 1 predicado
//		e.apellido=:datoApellido
		Predicate condicionApellido = myBuilder.equal(miTablaFrom.get(apellido), apellido);// atributo de la entidad el

		// atributo esta en mi tabla, condiciones estan dadas por metodos, hay mas
		// metodos bettew
//		4.Armamos mi sql final
		myCriteriaQuery.select(miTablaFrom).where(condicionApellido);
//		5.Ejecución del Query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);// puedo pasarle un objeto
																								// criteria query
		return myQueryFinal.getSingleResult();
	}

}