package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void ingresar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.insertar(producto);
	}

	@Override
	public int retirarProductoPorfecha(LocalDateTime fechaReferenciaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el inventario de la bodega!!");
		System.out.println(
				"Productos eliminados: " + this.productoRepository.eliminarProductoPorfecha(fechaReferenciaIngreso));
		return this.productoRepository.eliminarProductoPorfecha(fechaReferenciaIngreso);
	}

	@Override
	public void mostrarreporte(List<Producto> productos) {
		// TODO Auto-generated method stub
		LocalDateTime fechaReferencia = LocalDateTime.of(2014, 6, 1, 0, 0);
		System.out.println("*****************Reporte***************");
		for (Producto producto : productos) {
			if (producto.getFechaIngreso().isBefore(fechaReferencia)) {
				System.out.println("Producto: " + producto.getNombre());
				System.out.println("Fecha Ingreso: " + producto.getFechaIngreso());
				System.out.println("Stock: " + producto.getStock());
				System.out.println("Tipo: \n" + producto.getTipo());
				System.out.println("\n");
			}
		}
	}

}
