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
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// Creamos un estudiante1
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Paredes");
		estudiante1.setNombre("Juan Carlos");
		estudiante1.setCedula("1726890000");
		// insertar
		this.estudianteService.guradar(estudiante1);
		// Creamos un estudiante1
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Paredes");
		estudiante2.setNombre("Juan Carlos");
		estudiante2.setCedula("1726890001");
		this.estudianteService.guradar(estudiante2);
		this.estudianteService.borrar(estudiante2.getCedula());

		// buscar
		this.estudianteService.borrar(estudiante1.getCedula());
		// actualizar
		estudiante1.setNombre("Jean");
		this.estudianteService.actualizar(estudiante1);
		// borrar
		this.estudianteService.borrar(estudiante1.getCedula());
	}

}
