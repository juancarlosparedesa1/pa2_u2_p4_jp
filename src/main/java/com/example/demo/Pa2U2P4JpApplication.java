package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4JpApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Creamos un estudiante
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Paredes");
		estudiante1.setNombre("Juan Carlos");
		estudiante1.setCedula("1726890000");
		this.estudianteService.guradar(estudiante1);

	}

}
