package com.example.demo.repository;

import com.example.demo.repository.modelo.Cuenta;

public interface ICuentaRepository {

	public void insertar(Cuenta cuenta);

	public Cuenta buscar(String numero);

	public void actualizar(Cuenta cuenta);

	public void eliminar(String numero);
}
