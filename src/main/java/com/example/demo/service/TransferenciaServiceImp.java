package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICuentaRepository;
import com.example.demo.repository.ITransferenciaRepository;
import com.example.demo.repository.modelo.Cuenta;
import com.example.demo.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImp implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Autowired
	private ICuentaRepository cuentaRepository;

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.insertar(transferencia);

	}

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.buscar(id);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(transferencia);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminar(id);

	}

	@Override
	public void realizar(String numeroCtaOrigen, String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method

		// creo el registro de transferencia
		Transferencia transferencia = new Transferencia();
		transferencia.setComision(new BigDecimal(0.05));
		// 1.Busco la cuenta Origen

		Cuenta ctaOrigen = this.cuentaRepository.buscar(numeroCtaOrigen);

		// 2.Obtengo el saldo de la cuenta origen
		BigDecimal saldoCtaOrigen = ctaOrigen.getSaldo();

		// 3.validamos que el monto sea menor al saldo de la cuenta origen y tenemos en
		// cuenta la comision

		// el monto total es igual al monto sumado al 5% del monto
		BigDecimal montoTotal = monto.add(monto.multiply(transferencia.getComision()));

		if (montoTotal.compareTo(saldoCtaOrigen) <= 0) { // -1 b>a 0 a=b 1 a>b

			// 4.restamos el montoTotal del saldo de la cuenta origen
			saldoCtaOrigen = saldoCtaOrigen.subtract(montoTotal);
			// 5.actualizamos el saldo de la cta origen
			ctaOrigen.setSaldo(saldoCtaOrigen);
			this.cuentaRepository.actualizar(ctaOrigen);
			// 6.buscamos la cuenta destino
			Cuenta CtaDestino = this.cuentaRepository.buscar(numeroCtaDestino);
			// 7.obtengo el saldo de la cuenta destino
			BigDecimal saldoCtaDestino = CtaDestino.getSaldo();
			// 8.sumamos el monto de la transferencia a la cuenta destino
			saldoCtaDestino = saldoCtaDestino.add(monto);
			// 9.Actualizamos el saldo de la cuentaDestino
			CtaDestino.setSaldo(saldoCtaDestino);
			this.cuentaRepository.actualizar(CtaDestino);
			// 10.Creo el Registro de transferencia
			transferencia.setCtaDestino(numeroCtaDestino);
			transferencia.setCtaOrigen(numeroCtaOrigen);
			transferencia.setFecha(LocalDateTime.now());
			transferencia.setMonto(monto);
			// guardo la transferencia en la base de datos
			this.transferenciaRepository.insertar(transferencia);

		} else {
			System.out.println("Saldo insuficiente");
		}

	}

}
