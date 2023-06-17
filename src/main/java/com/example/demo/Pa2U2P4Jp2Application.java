package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.onetoone.repository.modelo.Ciudadano;
import com.example.demo.onetoone.repository.modelo.Empleado;
import com.example.demo.onetoone.service.ICiudadanoService;
import com.example.demo.onetoone.service.IEmpleadoService;

@SpringBootApplication
public class Pa2U2P4Jp2Application implements CommandLineRunner {

	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4Jp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//consola sentencias ddl se llaman
		// 1.Insertar ciudadano y empleado
		Empleado empleado1 = new Empleado();
		empleado1.setCargo("administrador");
		empleado1.setSueldo(new BigDecimal(1000));

		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setApellido("Paredes");
		ciudadano1.setCedula("1726890000");
		ciudadano1.setNombre("Juan Carlos");

		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setApellido("Angulo");
		ciudadano2.setCedula("1726000000");
		ciudadano2.setNombre("Jean Carlos");

		empleado1.setCiudadano(ciudadano2);
		ciudadano1.setEmpleado(empleado1);

//		this.ciudadanoService.agregar(ciudadano2);
		this.empleadoService.agregar(empleado1);

	}
}
