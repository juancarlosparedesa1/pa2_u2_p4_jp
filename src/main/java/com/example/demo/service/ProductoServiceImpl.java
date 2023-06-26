package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRespository;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRespository productoRespository;

	@Override
	public void ingresar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRespository.insertar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRespository.buscar(id);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRespository.actualizar(producto);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.productoRespository.eliminar(id);
	}

	@Override
	public Producto buscarPorNombreQuerySingleResult(String nombre) {
		// TODO Auto-generated method stub
		return this.productoRespository.buscarPorNombreQuerySingleResult(nombre);
	}

	@Override
	public List<Producto> buscarPorCodigoBarrasResultList(String codigBarras) {
		// TODO Auto-generated method stub
		return this.productoRespository.buscarPorCodigoBarrasResulList(codigBarras);
	}

	@Override
	public Producto buscarPorNombreSingleResultTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.productoRespository.buscarPorNombreSingleResultTypedQuery(nombre);
	}

	@Override
	public List<Producto> buscarPorCodigoBarrasResultListTypedQuery(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.productoRespository.buscarPorCodigoBarrasResultListTypedQuery(codigoBarras);
	}

	@Override
	public List<Producto> buscarPorPrecioQuery(BigDecimal precioLimite) {
		// TODO Auto-generated method stub
		return this.productoRespository.buscarPorPrecioQuery(precioLimite);
	}

	@Override
	public Producto BuscarPorNombreCodigoBarras(String nombre, String codigoBarras) {
		// TODO Auto-generated method stub
		List<Producto> productosBd = this.productoRespository.BuscarPorNombreCodigoBarras(nombre, codigoBarras);

		// valido si esta vacia
		if (productosBd.isEmpty()) {
			System.out.println("Producto no encontrado");
			return null;
		} else {
			// si no esta vacia retorna el primer elemento de la lista
			return productosBd.get(0);
		}

	}

}
