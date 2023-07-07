package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Bodega;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class Ejercicio23UpdateDeleteJpqlApplication implements CommandLineRunner {

	@Autowired
	private IProductoService productoService;
	@Autowired
	private IBodegaService bodegaService;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio23UpdateDeleteJpqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		1.El ingreso de 18  productos y 6 bodegas 

		Bodega bodega1 = new Bodega();
		bodega1.setEstado("D");
		bodega1.setNumero("000001");
		bodega1.setUbicacion("Pichincha");

//		Bodega bodega2 = new Bodega();
//		bodega2.setEstado("D");
//		bodega2.setNumero("000002");
//		bodega2.setUbicacion("Guayaquil");
//
//		Bodega bodega3 = new Bodega();
//		bodega3.setEstado("ND");
//		bodega3.setNumero("000003");
//		bodega3.setUbicacion("Manabi");
//
//		Bodega bodega4 = new Bodega();
//		bodega4.setEstado("ND");
//		bodega4.setNumero("000001");
//		bodega4.setUbicacion("Sangolqui");

		List<Producto> Productos = new ArrayList<>();

//		this.bodegaService.crear(bodega1);
//		this.bodegaService.crear(bodega2);
//		this.bodegaService.crear(bodega3);

		Producto producto1 = new Producto();
		producto1.setCosto(new BigDecimal(100));
		producto1.setFechaIngreso(LocalDateTime.of(2000, 01, 01, 0, 0));
		producto1.setNombre("Papel higienico");
		producto1.setStock(500);
		producto1.setTipo("aseo");
		producto1.setBodega(bodega1);
		Productos.add(producto1);

		Producto producto2 = new Producto();
		producto2.setCosto(new BigDecimal(200));
		producto2.setFechaIngreso(LocalDateTime.of(20011, 05, 01, 0, 0));
		producto2.setNombre("Deja");
		producto2.setStock(400);
		producto2.setTipo("aseo");
		producto2.setBodega(bodega1);
		Productos.add(producto2);

		Producto producto3 = new Producto();
		producto3.setCosto(new BigDecimal(300));
		producto3.setFechaIngreso(LocalDateTime.of(2005, 07, 01, 0, 0));
		producto3.setNombre("Cloro");
		producto3.setStock(300);
		producto3.setTipo("aseo");
		producto3.setBodega(bodega1);
		Productos.add(producto3);

		Producto producto4 = new Producto();
		producto4.setCosto(new BigDecimal(250));
		producto4.setFechaIngreso(LocalDateTime.of(2017, 06, 01, 0, 0));
		producto4.setNombre("Lenteja");
		producto4.setStock(700);
		producto4.setTipo("Despensa");
		producto4.setBodega(bodega1);
		Productos.add(producto4);

		Producto producto5 = new Producto();
		producto5.setCosto(new BigDecimal(350));
		producto5.setFechaIngreso(LocalDateTime.of(2014, 03, 01, 0, 0));
		producto5.setNombre("Atun");
		producto5.setStock(600);
		producto5.setTipo("Despensa");
		producto5.setBodega(bodega1);
		Productos.add(producto5);

		Producto producto6 = new Producto();
		producto6.setCosto(new BigDecimal(780));
		producto6.setFechaIngreso(LocalDateTime.of(2018, 05, 01, 0, 0));
		producto6.setNombre("Azucar");
		producto6.setStock(900);
		producto6.setTipo("Despensa");
		producto6.setBodega(bodega1);
		Productos.add(producto6);

		Producto producto7 = new Producto();
		producto7.setCosto(new BigDecimal(150));
		producto7.setFechaIngreso(LocalDateTime.of(2013, 02, 01, 0, 0));
		producto7.setNombre("Whiski");
		producto7.setStock(100);
		producto7.setTipo("Bebidas");
		producto7.setBodega(bodega1);
		Productos.add(producto7);

		Producto producto8 = new Producto();
		producto8.setCosto(new BigDecimal(550));
		producto8.setFechaIngreso(LocalDateTime.of(2014, 07, 01, 0, 0));
		producto8.setNombre("Coca cola");
		producto8.setStock(50);
		producto8.setTipo("Bebidas");
		producto8.setBodega(bodega1);
		Productos.add(producto8);

		Producto producto9 = new Producto();
		producto9.setCosto(new BigDecimal(950));
		producto9.setFechaIngreso(LocalDateTime.of(2010, 05, 01, 0, 0));
		producto9.setNombre("Cerveza");
		producto9.setStock(700);
		producto9.setTipo("Bebidas");
		producto9.setBodega(bodega1);
		Productos.add(producto9);

		Producto producto10 = new Producto();
		producto10.setCosto(new BigDecimal(250));
		producto10.setFechaIngreso(LocalDateTime.of(2017, 06, 01, 0, 0));
		producto10.setNombre("Suero");
		producto10.setStock(20);
		producto10.setTipo("Bebes");
//		Productos.add(producto10);
		producto10.setBodega(bodega1);
		Productos.add(producto10);

		Producto producto11 = new Producto();
		producto11.setCosto(new BigDecimal(150));
		producto11.setFechaIngreso(LocalDateTime.of(2020, 01, 01, 0, 0));
		producto11.setNombre("Vitamina c");
		producto11.setStock(100);
		producto11.setTipo("Bebes");
//		Productos.add(producto11);
		producto11.setBodega(bodega1);
		Productos.add(producto11);

		Producto producto12 = new Producto();
		producto12.setCosto(new BigDecimal(60));
		producto12.setFechaIngreso(LocalDateTime.of(2014, 8, 01, 0, 0));
		producto12.setNombre("Papilla");
		producto12.setStock(2000);
		producto12.setTipo("Bebes");
//		Productos.add(producto12);
		producto12.setBodega(bodega1);
		Productos.add(producto12);

		Producto producto13 = new Producto();
		producto13.setCosto(new BigDecimal(40));
		producto13.setFechaIngreso(LocalDateTime.of(2014, 8, 01, 0, 0));
		producto13.setNombre("Balanceado");
		producto13.setStock(3000);
		producto13.setTipo("Mascotas");
//		Productos.add(producto13);
		producto13.setBodega(bodega1);
		Productos.add(producto13);

		Producto producto14 = new Producto();
		producto14.setCosto(new BigDecimal(40));
		producto14.setFechaIngreso(LocalDateTime.of(2019, 7, 01, 0, 0));
		producto14.setNombre("jugetes");
		producto14.setStock(4000);
		producto14.setTipo("Mascotas");
//		Productos.add(producto14);
		producto14.setBodega(bodega1);
		Productos.add(producto14);

		Producto producto15 = new Producto();
		producto15.setCosto(new BigDecimal(100));
		producto15.setFechaIngreso(LocalDateTime.of(2012, 8, 01, 0, 0));
		producto15.setNombre("Medicina");
		producto15.setStock(500);
		producto15.setTipo("Mascotas");
//		Productos.add(producto15);
		producto15.setBodega(bodega1);
		Productos.add(producto15);

		Producto producto16 = new Producto();
		producto16.setCosto(new BigDecimal(200));
		producto16.setFechaIngreso(LocalDateTime.of(2014, 01, 01, 0, 0));
		producto16.setNombre("Shampoo");
		producto16.setStock(3000);
		producto16.setTipo("Cuidado Personal");
//		Productos.add(producto16);
		producto16.setBodega(bodega1);
		Productos.add(producto16);

		Producto producto17 = new Producto();
		producto17.setCosto(new BigDecimal(100));
		producto17.setFechaIngreso(LocalDateTime.of(2021, 8, 01, 0, 0));
		producto17.setNombre("Jabon");
		producto17.setStock(100);
		producto17.setTipo("Cuidado Personal");
//		Productos.add(producto17);
		producto17.setBodega(bodega1);
		Productos.add(producto17);

		Producto producto18 = new Producto();
		producto18.setCosto(new BigDecimal(300));
		producto18.setFechaIngreso(LocalDateTime.of(2022, 8, 01, 0, 0));
		producto18.setNombre("Toallas");
		producto18.setStock(1500);
		producto18.setTipo("Cuidado Personal");
//		Productos.add(producto18);
		producto18.setBodega(bodega1);
		Productos.add(producto18);

		bodega1.setProductos(Productos);
//		bodega2.setProductos(Productos);
//		bodega3.setProductos(Productos);

//		this.bodegaService.crear(bodega1);
//		this.bodegaService.crear(bodega2);
//		this.bodegaService.crear(bodega3);
//		this.bodegaService.crear(bodega4);

//		2.Retirar del inventario de la bodega productos que hayan sido ingresados antes de una fecha
//		especificada

//		this.productoService.retirarProductoPorfecha(LocalDateTime.of(2014, 06, 1, 0, 0));

//		3.Reporte productos retirados
//		this.productoService.mostrarreporte(Productos);

//		4.Actualizar la ubicacion de la bodega dado su numero
		this.bodegaService.cambiarUbicacion(bodega1.getNumero(), "Los valles");
	}
}