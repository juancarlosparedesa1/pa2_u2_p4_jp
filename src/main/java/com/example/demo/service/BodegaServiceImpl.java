package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IBodegaRepository;
import com.example.demo.repository.modelo.Bodega;

@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private IBodegaRepository bodegaRepository;

	@Override
	public void crear(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepository.insetar(bodega);
	}

	@Override
	public int cambiarUbicacion(String numeroBodega, String nuevaUbicacion) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizara la ubicacion de la bodega");
		System.out.println("Actualizando la ubicacion de la bodega.....");
		System.out.println("ubicacion actualizada!!");
		return this.bodegaRepository.actualizarUbicacion(numeroBodega, nuevaUbicacion);
	}

}
