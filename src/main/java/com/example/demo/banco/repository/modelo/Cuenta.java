package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "") // money saldo thymestamp_whitouth time zone
public class Cuenta {
	@Id
	@GeneratedValue(generator = "seq_cuenta", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cuenta", sequenceName = "seq_cuenta", allocationSize = 1)
	@Column(name = "cuent_id")
	private Integer id;
	@Column(name = "cuent_numero")
	private String numero;
	@Column(name = "cuent_tipo")
	private String tipo;
	@Column(name = "cuent_fecha_apertura")
	private LocalDateTime fechaApertura;
	@Column(name = "cuent_saldo")
	private BigDecimal saldo;
	@Column(name = "cuent_cedula_prop")
	private String cedulaPropietario;

	// get and set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDateTime fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura
				+ ", saldo=" + saldo + ", cedulaPropietario=" + cedulaPropietario + "]";
	}

}
