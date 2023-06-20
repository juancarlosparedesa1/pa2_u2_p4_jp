package com.example.demo.libreria.service;

import com.example.demo.libreria.repository.modelo.Autor;

public interface IAutorService {
	public void agregar(Autor autor);

	public Autor buscar(Integer id);

	public void actualizar(Autor autor);

	public void borrar(Integer id);
}
