package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRespository {

	public void insertar(Producto producto);

	public Producto buscar(Integer id);

	public void actualizar(Producto producto);

	public void eliminar(Integer id);

	public Producto buscarPorNombreQuerySingleResult(String nombre);

	public List<Producto> buscarPorCodigoBarrasResulList(String CodigoBarras);

	public Producto buscarPorNombreSingleResultTypedQuery(String nombre);

	public List<Producto> buscarPorCodigoBarrasResultListTypedQuery(String CodigoBarras);

	public List<Producto> buscarPorPrecioQuery(BigDecimal precioLimite);
	
	public List<Producto> BuscarPorNombreCodigoBarras(String nombre,String codigoBarras);

}
