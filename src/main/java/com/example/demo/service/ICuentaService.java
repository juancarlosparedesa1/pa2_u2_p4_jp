package com.example.demo.service;

import com.example.demo.repository.modelo.Cuenta;

public interface ICuentaService {

	public void guardar(Cuenta cuenta);

	public Cuenta buscar(String numero);

	public void actualizar(Cuenta cuenta);

	public void eliminar(String numero);
}
