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

		// guardar estudiante en la bd
		// nota, se guarda por una sola vez si no tiene secuencia
		// this.estudianteService.guradar(estudiante1);

		// buscar estudiante
		Estudiante estudianteBuscado = this.estudianteService.buscar(estudiante1.getCedula());
		System.out.println("Se encontro el estudiante:" + estudianteBuscado);

		// actualizar
		estudiante1.setApellido("Angulo");
		this.estudianteService.actualizar(estudianteBuscado);
		System.out.println("Se imprime el estudiante con los datos actualizados:" + estudiante1);

		// eliminar estudiante
		System.out.println("Eliminando estudiante.....");
		this.estudianteService.borrar(estudiante1.getCedula());

	}

}
