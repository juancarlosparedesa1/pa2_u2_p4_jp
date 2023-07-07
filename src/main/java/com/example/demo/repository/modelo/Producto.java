package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	// Secuencias
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pdct")
	@SequenceGenerator(name = "seq_pdct", sequenceName = "seq_pdct", allocationSize = 1)
	@Column(name = "pdct_id")
	private Integer id;
	@Column(name = "pdct_nombre")
	private String nombre;
	@Column(name = "pdct_costo")
	private BigDecimal costo;
	@Column(name = "pdct_stock")
	private Integer Stock;
	@Column(name = "pdct_fecha_ingreso")
	private LocalDateTime fechaIngreso;
	@Column(name = "pdct_tipo")
	private String tipo;

	// relacion(Hijo)
	@ManyToOne
	@JoinColumn(name = "pdct_id_bodega")
	private Bodega bodega;

//	GET AND SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

}
