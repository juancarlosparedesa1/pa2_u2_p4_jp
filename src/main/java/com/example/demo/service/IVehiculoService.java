package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface IVehiculoService {
	public void ingresar(Vehiculo vehiculo);

	public Vehiculo seleccionar(Integer id);

	public void actualizar(Vehiculo vehiculo);

	public void borrar(Integer id);

	public Vehiculo buscarPorPlaca(String placa);

	public Vehiculo buscarVehiculoAnioFabricacion(String anioFabricacion);

	public Vehiculo buscarVehiculoPorModeloTipoPlacaNumeroSerie(String modelo, String tipo, String placa,
			String numeroSerie, String anioFabricacion);

}
