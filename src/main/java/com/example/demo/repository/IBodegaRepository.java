package com.example.demo.repository;

import com.example.demo.repository.modelo.Bodega;

public interface IBodegaRepository {

	public void insetar(Bodega bodega);

	public int actualizarUbicacion(String numeroBodega, String nuevaUbicacion);
}
