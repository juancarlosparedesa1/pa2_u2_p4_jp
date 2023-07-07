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
	public void realizarMatricula(String placa, BigDecimal costo, LocalDateTime fechaMatricula) {
		// TODO Auto-generated method stub

		Vehiculo vehiculobd = this.vehiculoRepository.SeleccionarPorPlaca(placa);

		Matricula matricula = new Matricula();

		// transformo a entero el año de fabricacion
		int anioFabricacionInt = Integer.parseInt(vehiculobd.getAnioFabricacion());
//		inicializao en null el costoMatricula para hacer operaciones y setear
		BigDecimal costoMatricula = new BigDecimal(0);
		// valido el año de fabricacion y de acuerdo a eso obtengo el costo de la
		// matricula
		if (anioFabricacionInt > 2000) {
//			System.out.println("ingreso al primer if");
			costoMatricula = costo;
		} else {
			if (anioFabricacionInt < 2000) {
//				System.out.println("ingreso al segundo if");
				costoMatricula = costo.add(costo.multiply(new BigDecimal(.10)));
			}

		}
//		seteo los datos de la matricula
		matricula.setCosto(costoMatricula);
		matricula.setFecha(fechaMatricula);
		matricula.setTipo("oridinaria");
		matricula.setVehiculo(vehiculobd);
		this.matriculaRepository.insertar(matricula);

	}

}
