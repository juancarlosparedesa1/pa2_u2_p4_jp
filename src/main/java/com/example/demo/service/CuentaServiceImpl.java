package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICuentaRepository;
import com.example.demo.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements ICuentaService {

	@Autowired
	private ICuentaRepository cuentaRepository;
	
	@Override
	public void guardar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public Cuenta buscar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.buscar(numero);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(numero);
		
	}

}
