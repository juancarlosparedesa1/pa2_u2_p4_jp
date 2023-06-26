package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class Tarea7QueryYTypedQueryApplication implements CommandLineRunner {

	@Autowired
	private IProductoService productoService;

	public static void main(String[] args) {
		SpringApplication.run(Tarea7QueryYTypedQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		Creamos un producto

		Producto producto1 = new Producto();
		producto1.setCodigoBarras("001");
		producto1.setNombre("CocaCola");
		producto1.setPrecio(new BigDecimal(100));

		Producto producto2 = new Producto();
		producto2.setCodigoBarras("002");
		producto2.setNombre("jugos");
		producto2.setPrecio(new BigDecimal(150));

		Producto producto3 = new Producto();
		producto3.setCodigoBarras("003");
		producto3.setNombre("comestibles");
		producto3.setPrecio(new BigDecimal(300));

//		this.productoService.ingresar(producto1);

//		1.Buscamos producto por nombre 
//		Query con un Single Result

//		this.productoService.buscarPorNombreQuerySingleResult(producto1.getNombre());

//		2.Buscamos Por codigo de barras
//		Query con un Result List

//		this.productoService.buscarPorCodigoBarrasResultList(producto1.getCodigoBarras());

//		3.Buscamos producto por nombre
//		TypedQuery con single Result
		// borrarmos un producto para evitar el error
//		borramos el producto ingresado numero 2
//		this.productoService.borrar(2);
//		buscamos el producto por nombre
//		this.productoService.buscarPorNombreSingleResultTypedQuery(producto1.getNombre());

//		4.Buscamos el producto por codigo de barras
//		Query con Result List
//		Agregamos otro registro de producto
//		this.productoService.ingresar(producto1);
//		Buscamos el producto por codigo de barras
//		this.productoService.buscarPorCodigoBarrasResultListTypedQuery(producto1.getCodigoBarras());

//		5.Buscamos el producto por nombre y por codigo de barras
//		this.productoService.ingresar(producto1);
//		this.productoService.ingresar(producto2);	
//		this.productoService.ingresar(producto3);
		System.out.println(this.productoService.BuscarPorNombreCodigoBarras("Perrecibles", "005"));

//		6.buscamos productos con precio mayor a 100 dolares 
//		Query con getResultList
//		Agregamos dos registros de producto mas 
//		this.productoService.ingresar(producto2);
//		this.productoService.ingresar(producto3);
//		this.productoService.buscarPorPrecioQuery(new BigDecimal(100));
//		List<Producto>reporte=this.productoService.buscarPorPrecioQuery(new BigDecimal(100));
//		
//		for (Producto producto : reporte) {
//			System.out.println(producto);
//		}

	}

}
