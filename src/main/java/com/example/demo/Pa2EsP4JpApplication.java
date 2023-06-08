package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Cuenta;
import com.example.demo.service.ICuentaService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class Pa2EsP4JpApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICuentaService cuentaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2EsP4JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// 1.Crear dos cuentas bancarias
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setCedulaPropietario("1726897200");
		cuenta1.setNumero("001");
		cuenta1.setSaldo(new BigDecimal(500));
		cuenta1.setTipo("A");

		Cuenta cuenta2 = new Cuenta();
		cuenta2.setCedulaPropietario("1726890000");
		cuenta2.setNumero("002");
		cuenta2.setSaldo(new BigDecimal(500));
		cuenta2.setTipo("A");
		this.cuentaService.guardar(cuenta1);
		this.cuentaService.guardar(cuenta2);

		// 2. Realizar una transferencia con los datos del punto anterior
		this.transferenciaService.realizar(cuenta1.getNumero(), cuenta2.getNumero(), new BigDecimal(100));

		// 3.Buscar e imprimir el saldo de la cuenta bancaria origen
		System.out.println("Saldo Cuenta Origen:" + this.cuentaService.buscar(cuenta1.getNumero()).getSaldo());

	}

}
