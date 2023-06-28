package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4Jp2Application implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4Jp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Paredes");
		estudiante1.setCedula("1234567890");
		estudiante1.setNombre("Juan Carlos");
//		this.estudianteService.guradar(estudiante1);

		this.estudianteService.buscarPorApellido("Paredes");

//		this.estudianteService.reporte("Paredes");

		System.out.println("Buscar por apellido y nombre Query");
		this.estudianteService.SeleccionarPorApellidoyNombre("Paredes", "Juan Carlos");

		System.out.println("Buscar por apellido typed");
		this.estudianteService.seleccionarPorApellidoTyped("Paredes");

		System.out.println("Busqueda con named");
		this.estudianteService.buscaPorApellidoNamed(estudiante1.getApellido());

		System.out.println("Busqued con NamedQuery apellido");
		this.estudianteService.buscaPorApellidoNamedQuery(estudiante1.getApellido());

		System.out.println("Busqueda o seleccionar con NativeQuery");
		this.estudianteService.seleccionarPorApellidoNativeQuery(estudiante1.getApellido());

		System.out.println("Busqueda o seleccionar con NativeQueryNamed");
		this.estudianteService.seleccionarPorApellidoNativeQueryNamed(estudiante1.getApellido());

		System.out.println("Busqued con NamedQuery nombre");

		this.estudianteService.buscaPorNombreNamedQuery(estudiante1.getNombre());
		System.out.println("Busqueda o seleccionar con NativeQueryNamed nombre");
		this.estudianteService.seleccionarPorNombreNativeQueryNamed(estudiante1.getNombre());

	}
}
