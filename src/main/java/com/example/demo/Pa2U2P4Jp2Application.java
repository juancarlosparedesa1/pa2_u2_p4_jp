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
		estudiante1.setPeso(new Double(50));
//		this.estudianteService.guardar(estudiante1);

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Caceres");
		estudiante2.setCedula("172200000");
		estudiante2.setNombre("Luis");
		estudiante2.setPeso(new Double(150));
//		this.estudianteService.guardar(estudiante2);

//		this.estudianteService.buscarPorApellido("Paredes");
//
////		this.estudianteService.reporte("Paredes");
//
//		System.out.println("Buscar por apellido y nombre Query");
//		this.estudianteService.SeleccionarPorApellidoyNombre("Paredes", "Juan Carlos");
//
//		System.out.println("Buscar por apellido typed");
//		this.estudianteService.seleccionarPorApellidoTyped("Paredes");
//
//		System.out.println("Busqueda con named");
//		this.estudianteService.buscaPorApellidoNamed(estudiante1.getApellido());
//
//		System.out.println("Busqued con NamedQuery apellido");
//		this.estudianteService.buscaPorApellidoNamedQuery(estudiante1.getApellido());
//
//		System.out.println("Busqueda o seleccionar con NativeQuery");
//		this.estudianteService.seleccionarPorApellidoNativeQuery(estudiante1.getApellido());
//
//		System.out.println("Busqueda o seleccionar con NativeQueryNamed");
//		this.estudianteService.seleccionarPorApellidoNativeQueryNamed(estudiante1.getApellido());
//
//		System.out.println("Busqued con NamedQuery nombre");
//
//		this.estudianteService.buscaPorNombreNamedQuery(estudiante1.getNombre());
//		System.out.println("Busqueda o seleccionar con NativeQueryNamed nombre");
//		this.estudianteService.seleccionarPorNombreNativeQueryNamed(estudiante1.getNombre());

		System.out.println("Busqueda buscarEstudianteDinamico");
		this.estudianteService.buscarEstudianteDinamico(estudiante1.getNombre(), estudiante1.getApellido(),
				estudiante1.getPeso());
		this.estudianteService.buscarEstudianteDinamico(estudiante2.getNombre(), estudiante2.getApellido(),
				estudiante2.getPeso());
		System.out.println("Actualizar y eliminar estudiante");
		System.out.println(
				this.estudianteService.actualizarPorApellido(estudiante1.getNombre(), estudiante1.getApellido()));
		System.out.println(this.estudianteService.borrarPorNombre(estudiante2.getNombre()));

	}
}
