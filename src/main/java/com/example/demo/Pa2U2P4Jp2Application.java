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

		this.estudianteService.SeleccionarPorApellidoyNombre("Paredes", "Juan Carlos");

		this.estudianteService.seleccionarPorApellidoTyped("Paredes");

	}
}
