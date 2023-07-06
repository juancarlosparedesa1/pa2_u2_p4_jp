package com.example.demo.repository;

import com.example.demo.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	public void insertar(Vehiculo vehiculo);

	public Vehiculo seleccionar(Integer id);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(Integer id);

	public Vehiculo SeleccionarPorPlaca(String placa);

//	criteriaApiQuery
	public Vehiculo SeleccionarAnioFabricacion(String anioFabricacion);
//	Query Criteria Dinamico

	public Vehiculo SeleccionarPorModeloTipoPlacaNumeroSerieDinamico(String modelo, String tipo, String placa,
			String numeroSerie, String anioFabricacion);

}
