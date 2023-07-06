package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public void ingresar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public Vehiculo seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(vehiculo);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(id);
	}

	@Override
	public Vehiculo buscarVehiculoAnioFabricacion(String anioFabricacion) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.SeleccionarAnioFabricacion(anioFabricacion);
	}

	@Override
	public Vehiculo buscarVehiculoPorModeloTipoPlacaNumeroSerie(String modelo, String tipo, String placa,
			String numeroSerie, String anioFabricacion) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.SeleccionarPorModeloTipoPlacaNumeroSerieDinamico(modelo, tipo, placa,
				numeroSerie, anioFabricacion);
	}

	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.SeleccionarPorPlaca(placa);
	}

}
