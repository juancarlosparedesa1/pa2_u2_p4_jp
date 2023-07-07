package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Ejercicio22CriteriaApiQueryApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio22CriteriaApiQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		1.ingresar un vehiculo
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setAnioFabricacion("1980");
		vehiculo1.setModelo("Sedan");
		vehiculo1.setNumeroSerie("000001");
		vehiculo1.setPlaca("abc-123");
		vehiculo1.setTipo("Liviano");

		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setAnioFabricacion("2011");
		vehiculo2.setModelo("Sedad");
		vehiculo2.setNumeroSerie("000002");
		vehiculo2.setPlaca("def-456");
		vehiculo2.setTipo("Liviano");

//		System.out.println("ingresando vehiculos....");
		this.vehiculoService.ingresar(vehiculo1);
		this.vehiculoService.ingresar(vehiculo2);
//		2.buscar el vehiculo por año de fabricacion (repasoCriteriaApiQuery)
		System.out.println("Buscando vehiculo por año de fabricacion....");
		this.vehiculoService.buscarVehiculoAnioFabricacion(vehiculo1.getAnioFabricacion());
		this.vehiculoService.buscarVehiculoAnioFabricacion(vehiculo2.getAnioFabricacion());

//		3.Buscar un vehiculo con un Query Dinamico con los atributos(modelo,tipo,placa,numeroSerie,anioFabricacion) 
		System.out.println("Buscando Vehiculos con un QueryDinamico........");
		this.vehiculoService.buscarVehiculoPorModeloTipoPlacaNumeroSerie(vehiculo1.getModelo(), vehiculo1.getTipo(),
				vehiculo1.getPlaca(), vehiculo1.getNumeroSerie(), vehiculo1.getAnioFabricacion());

		this.vehiculoService.buscarVehiculoPorModeloTipoPlacaNumeroSerie(vehiculo2.getModelo(), vehiculo2.getTipo(),
				vehiculo2.getPlaca(), vehiculo2.getNumeroSerie(), vehiculo2.getAnioFabricacion());

//		4.Realizar Matricula unicamente con los atributos (placa y fecha de matricula) 
		this.matriculaService.realizarMatricula(vehiculo1.getPlaca(), new BigDecimal(500), LocalDateTime.now());
		this.matriculaService.realizarMatricula(vehiculo2.getPlaca(), new BigDecimal(500), LocalDateTime.now());
	}

}
