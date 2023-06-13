package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.ICuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;

@Service("par")
public class AumentoAperturaDiaPar implements IAumentoApertura {

	@Autowired
	private ICuentaRepository cuentaRepository;
	@Override
	public BigDecimal calcularAumento(BigDecimal saldo) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta();
		cuenta.setSaldo(new BigDecimal(100));
		System.out.println(
				"El día es par felicidades por la apertura de tu cuenta" + "se le aumentara un 5% a tu deposito");
		return saldo = cuenta.getSaldo().add(cuenta.getSaldo().multiply(new BigDecimal(0.05)));
	}

}
