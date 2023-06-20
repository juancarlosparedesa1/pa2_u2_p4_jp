package com.example.demo.libreria.repository;

import com.example.demo.libreria.repository.modelo.Libro;

public interface ILibroRepository {

	public void insertar(Libro libro);

	public Libro buscar(Integer id);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);
}
