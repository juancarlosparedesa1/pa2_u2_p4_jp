package com.example.demo.service;

import com.example.demo.repository.modelo.Bodega;

public interface IBodegaService {

	public void crear(Bodega bodega);

	public int cambiarUbicacion(String numeroBodega, String nuevaUbicacion);

}
