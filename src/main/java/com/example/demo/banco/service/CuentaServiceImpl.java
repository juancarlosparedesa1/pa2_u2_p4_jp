package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.ICuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements ICuentaService {

	@Autowired
	private ICuentaRepository cuentaRepository;

	@Override
	public void aperturar(Cuenta cuenta) {

		BigDecimal nuevoSaldo = null;
		if (cuenta != null) {
			int dia = cuenta.getFechaApertura().getDayOfMonth();

			if (dia % 2 == 0) {
				System.out.println("El día es par felicidades por la apertura de tu cuenta"
						+ "se le aumentara un 5% a tu deposito");
				nuevoSaldo = cuenta.getSaldo().add(cuenta.getSaldo().multiply(new BigDecimal(0.05)));

			} else {
				System.out.println("El día es impar la proxima sera tu dia de suerte");

			}

		}
		cuenta.setCedulaPropietario(cuenta.getCedulaPropietario());
		cuenta.setFechaApertura(cuenta.getFechaApertura());
		cuenta.setNumero(cuenta.getNumero());
		cuenta.setSaldo(nuevoSaldo);
		cuenta.setTipo(cuenta.getTipo());
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.buscar(id);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(id);

	}

}
