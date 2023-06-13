package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.ICuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements ICuentaService {

	@Autowired
	private ICuentaRepository cuentaRepository;
	@Autowired
	@Qualifier("impar")
	private IAumentoApertura aumentoApertura;

	@Override
	public void aperturar(Cuenta cuenta) {
		this.cuentaRepository.insertar(cuenta);
		int dia = cuenta.getFechaApertura().getDayOfMonth();

		if (dia % 2 == 0) {
			cuenta.setSaldo(this.aumentoApertura.calcularAumento(cuenta.getSaldo()));
			this.cuentaRepository.actualizar(cuenta);
		} else {
			System.out.println("El día es impar la proxima sera tu dia de suerte");
			cuenta.setSaldo(this.aumentoApertura.calcularAumento(cuenta.getSaldo()));
			this.cuentaRepository.actualizar(cuenta);
		}

//		cuenta.setCedulaPropietario(cuenta.getCedulaPropietario());
//		cuenta.setFechaApertura(cuenta.getFechaApertura());
//		cuenta.setNumero(cuenta.getNumero());
//		cuenta.setSaldo(nuevoSaldo);
//		cuenta.setTipo(cuenta.getTipo());

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
