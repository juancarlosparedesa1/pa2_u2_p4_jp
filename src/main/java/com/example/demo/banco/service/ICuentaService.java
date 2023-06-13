package com.example.demo.banco.service;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface ICuentaService {
	public void aperturar(Cuenta cuenta);

	public Cuenta buscar(Integer id);

	public void actualizar(Cuenta cuenta);

	public void borrar(Integer id);
}
