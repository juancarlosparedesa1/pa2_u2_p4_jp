package com.example.demo.libreria.service;

import com.example.demo.libreria.repository.modelo.Libro;

public interface ILibroService {
	public void agregar(Libro libro);

	public Libro buscar(Integer id);

	public void actualizar(Libro libro);

	public void borrar(Integer id);
}
