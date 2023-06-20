package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.libreria.repository.modelo.Autor;
import com.example.demo.libreria.repository.modelo.Libro;
import com.example.demo.libreria.service.IAutorService;
import com.example.demo.libreria.service.ILibroService;

@SpringBootApplication
public class Pa2U2P4Jp2Application implements CommandLineRunner {

	@Autowired
	private IAutorService autorService;
	@Autowired
	private ILibroService libroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4Jp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creamos un autor

		Set<Libro> ConjuntoLibros = new HashSet<>();
		Set<Autor> ConjuntoAutores = new HashSet<>();
		Autor autor1 = new Autor();
		autor1.setApellido("Paredes");
		autor1.setNombre("Juan Carlos");
		ConjuntoAutores.add(autor1);

		Libro libro1 = new Libro();
		libro1.setEditorial("Editorial1");
		libro1.setTitulo("Titulo 1");
		libro1.setAutores(ConjuntoAutores);
		ConjuntoLibros.add(libro1);

		Libro libro2 = new Libro();
		libro2.setEditorial("Editorial2");
		libro2.setTitulo("Titulo 2");
		libro2.setAutores(ConjuntoAutores);
		ConjuntoLibros.add(libro2);

		Libro libro3 = new Libro();
		libro3.setEditorial("Editorial3");
		libro3.setTitulo("Titulo 3");
		libro3.setAutores(ConjuntoAutores);
		ConjuntoLibros.add(libro3);

		autor1.setLibros(ConjuntoLibros);
		this.autorService.agregar(autor1);

	}
}
