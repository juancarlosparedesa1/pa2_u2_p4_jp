package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.modelo.Cuenta;

@Service("impar")
public class AumentoAperturaDiaImpar implements IAumentoApertura {

	@Override
	public BigDecimal calcularAumento(BigDecimal saldo) {
		Cuenta cuenta = new Cuenta();
		cuenta.setSaldo(new BigDecimal(100));
		return cuenta.getSaldo();
	}

}
