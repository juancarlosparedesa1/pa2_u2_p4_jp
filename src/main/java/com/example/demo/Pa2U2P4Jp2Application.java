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

//		Entidad principal Autor(Cascade en el atributo libros de la clase autor)
//		*****************un autor va a tener un conjunto de libros***************
//		//creamos un conjunto de autores y un conjunto de libros
//		Set<Libro> ConjuntoLibros = new HashSet<>();
//		Set<Autor> ConjuntoAutores = new HashSet<>();
//		
//		//creamos un autor y lo añadimos al conjunto de autores
//		Autor autor1 = new Autor();
//		autor1.setApellido("Paredes");
//		autor1.setNombre("Juan Carlos");
//		ConjuntoAutores.add(autor1);
//
//		//cremos un libro1, libro2 y libro 3
////		y lo añadios al conjunto de libros y le seteamos el autor el conjunto de autores
//		Libro libro1 = new Libro();
//		libro1.setEditorial("Editorial1");
//		libro1.setTitulo("Titulo 1");
//		libro1.setAutores(ConjuntoAutores);
//		ConjuntoLibros.add(libro1);
//
//		Libro libro2 = new Libro();
//		libro2.setEditorial("Editorial2");
//		libro2.setTitulo("Titulo 2");
//		libro2.setAutores(ConjuntoAutores);
//		ConjuntoLibros.add(libro2);
//
//		Libro libro3 = new Libro();
//		libro3.setEditorial("Editorial3");
//		libro3.setTitulo("Titulo 3");
//		libro3.setAutores(ConjuntoAutores);
//		ConjuntoLibros.add(libro3);
//
//		//seteamos el autor con el conjunto de libros
//		autor1.setLibros(ConjuntoLibros);
//		//agreamos el autor a la bd
//		this.autorService.agregar(autor1);

//		Entidad prinpal libros(Cascade en el atributo autores de la clase libros)
//		*******************************un libro va a tener un conjunto de autores************************

		Set<Libro> ConjuntoLibros = new HashSet<>();
		Set<Autor> ConjuntoAutores = new HashSet<>();

		// creamos un libro y lo añadimos al conjunto de libros

		Libro libro1 = new Libro();
		libro1.setEditorial("Editorial 1");
		libro1.setTitulo("Titulo1");
		ConjuntoLibros.add(libro1);

		// Creamso autor1,autor2,autor3, seteamos el autor y lo añañdimos al conjunto de
		// autores
		Autor autor1 = new Autor();
		autor1.setApellido("Paredes");
		autor1.setNombre("Juan Carlos");
		autor1.setLibros(ConjuntoLibros);
		ConjuntoAutores.add(autor1);

		Autor autor2 = new Autor();
		autor2.setApellido("Angulo");
		autor2.setNombre("Alicia");
		autor2.setLibros(ConjuntoLibros);
		ConjuntoAutores.add(autor2);

		Autor autor3 = new Autor();
		autor3.setApellido("Benitez");
		autor3.setNombre("Beatriz");
		autor3.setLibros(ConjuntoLibros);
		ConjuntoAutores.add(autor3);

		// seteamos el libro con el conjunto de autores
		libro1.setAutores(ConjuntoAutores);
		// agreagamos a la base de datos o insertamos el libro y los autores

//		1.Insertamos libros y autores
		System.out.println("agregando datos.....");
//		this.libroService.agregar(libro1);
		System.out.println("datos agregados correctamente!!");

//		2.Buscar libros y autores
		System.out.println("Buscando datos....");
//		this.autorService.buscar(1);
//		this.autorService.buscar(2);
		System.out.println("datos encontrados exitosamente......");

//		3.actualizar libro y autor
		System.out.println("Actualizando datos......");
//		libro1.setEditorial("nueva editorial");
//		autor1.setApellido("nuevo apellido");
//		this.libroService.actualizar(libro1);
		System.out.println("Datos actualizados correctamente");

//		4.eliminar autor

		System.out.println("eliminando datos.....");
		this.autorService.borrar(4);
		this.libroService.borrar(2);
		System.out.println("datos eliminados correctamente!!");
	}
}
