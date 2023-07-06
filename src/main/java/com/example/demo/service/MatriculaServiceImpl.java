package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public Matricula seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(id);
	}

	@Override
	public void realizarMatricula(String placa, LocalDateTime fechaMatricula) {
		// TODO Auto-generated method stub

		Vehiculo vehiculobd = this.vehiculoRepository.SeleccionarPorPlaca(placa);

		Matricula matricula = new Matricula();
		matricula.setCosto(new BigDecimal(500));
		matricula.setFecha(fechaMatricula);
		matricula.setTipo("oridinaria");
		matricula.setVehiculo(vehiculobd);
		this.matriculaRepository.insertar(matricula);

	}

}
