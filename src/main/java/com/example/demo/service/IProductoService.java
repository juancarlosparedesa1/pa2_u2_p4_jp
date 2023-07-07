package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IProductoService {

	public void ingresar(Producto producto);

	public int retirarProductoPorfecha(LocalDateTime fechaReferenciaIngreso);

	public void mostrarreporte(List<Producto> productos);
}
