package com.example.demo.libreria.repository;

import com.example.demo.libreria.repository.modelo.Autor;

public interface IAutorRepository {

	public void insertar(Autor autor);

	public Autor buscar(Integer id);

	public void actualizar(Autor autor);

	public void eliminar(Integer id);
}
