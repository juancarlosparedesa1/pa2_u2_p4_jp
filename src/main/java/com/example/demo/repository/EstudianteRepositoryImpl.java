package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
//		SELECT * FROM estudiante e WHERE e.estu_apellido=
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
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorAppelido",
				Estudiante.class);

		myQuery.setParameter("datoApellido", apellido);

		return myQuery.getSingleResult();
	}

}