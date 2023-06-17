package com.example.demo.onetoone.service;

import com.example.demo.onetoone.repository.modelo.Empleado;

public interface IEmpleadoService {
	public void agregar(Empleado empleado);

	public Empleado buscar(Integer id);

	public void actualizar(Empleado empleado);

	public void borrar(Integer id);
}
