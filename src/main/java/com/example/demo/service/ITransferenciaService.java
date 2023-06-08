package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.Transferencia;

public interface ITransferenciaService {

	public void guardar(Transferencia transferencia);

	public Transferencia buscar(Integer id);

	public void actualizar(Transferencia transferencia);

	public void borrar(Integer id);

	public void realizar(String numeroCtaOrigen, String numeroCtaDestino, BigDecimal monto);
}
