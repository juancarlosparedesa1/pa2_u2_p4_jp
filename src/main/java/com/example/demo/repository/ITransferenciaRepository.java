package com.example.demo.repository;

import com.example.demo.repository.modelo.Transferencia;

public interface ITransferenciaRepository {
	public void insertar(Transferencia transferencia);

	public Transferencia buscar(Integer id);

	public void actualizar(Transferencia transferencia);

	public void eliminar(Integer id);
}
