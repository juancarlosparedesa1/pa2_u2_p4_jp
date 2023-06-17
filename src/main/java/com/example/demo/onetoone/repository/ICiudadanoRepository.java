package com.example.demo.onetoone.repository;

import com.example.demo.onetoone.repository.modelo.Ciudadano;

public interface ICiudadanoRepository {

	public void insertar(Ciudadano ciudadano);

	public Ciudadano Buscar(Integer id);

	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);
}
