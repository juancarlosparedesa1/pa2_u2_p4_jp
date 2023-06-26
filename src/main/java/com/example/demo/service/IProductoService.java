package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IProductoService {

	public void ingresar(Producto producto);

	public Producto buscar(Integer id);

	public void actualizar(Producto producto);

	public void borrar(Integer id);

	public Producto buscarPorNombreQuerySingleResult(String nombre);

	public List<Producto> buscarPorCodigoBarrasResultList(String codigBarras);

	public Producto buscarPorNombreSingleResultTypedQuery(String nombre);

	public List<Producto> buscarPorCodigoBarrasResultListTypedQuery(String codigoBarras);

	public List<Producto> buscarPorPrecioQuery(BigDecimal precioLimite);

	public Producto BuscarPorNombreCodigoBarras(String nombre, String codigoBarras);

}
