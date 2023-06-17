package com.example.demo.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.onetoone.repository.IEmpleadoRepository;
import com.example.demo.onetoone.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepository empleadoRepository;

	@Override
	public void agregar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepository.insertar(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepository.Buscar(id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepository.actualizar(empleado);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepository.eliminar(id);
	}

}