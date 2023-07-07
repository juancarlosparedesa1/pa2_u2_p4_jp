package com.example.demo.repository;

import java.time.LocalDateTime;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto producto);

	public int eliminarProductoPorfecha(LocalDateTime fechaReferenciaIngreso);
}
