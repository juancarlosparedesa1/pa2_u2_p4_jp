package com.example.demo.repository.modelo;

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
@Table(name = "transferencia")
public class Transferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transfer_seq")
	@SequenceGenerator(name = "transfer_seq", sequenceName = "transfer_seq", allocationSize = 1)
	@Column(name = "transf_id")
	private Integer id;
	@Column(name = "transf_fecha")
	private LocalDateTime fecha;
	@Column(name = "transf_monto")
	private BigDecimal monto;
	@Column(name = "transf_comision")
	private BigDecimal comision;
	@Column(name = "transf_numero_ctaDestino")
	private String ctaDestino;
	@Column(name = "transf_numero_ctaOrigen")
	private String ctaOrigen;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public BigDecimal getComision() {
		return comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	public String getCtaDestino() {
		return ctaDestino;
	}

	public void setCtaDestino(String ctaDestino) {
		this.ctaDestino = ctaDestino;
	}

	public String getCtaOrigen() {
		return ctaOrigen;
	}

	public void setCtaOrigen(String ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}

	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", comision=" + comision
				+ ", ctaDestino=" + ctaDestino + ", ctaOrigen=" + ctaOrigen + "]";
	}

}
