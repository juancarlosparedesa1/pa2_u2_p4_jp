package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.repository.modelo.Estudiante;

public interface ICuentaRepository {

	// CRUD
	public void insertar(Cuenta cuenta);

	public Cuenta buscar(Integer id);

	public void actualizar(Cuenta cuenta);

	public void eliminar(Integer id);
}
