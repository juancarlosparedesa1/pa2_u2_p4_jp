package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "bodega")
public class Bodega {
	@Id
	// Secuencias
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bdga")
	@SequenceGenerator(name = "seq_bdga", sequenceName = "seq_bdga", allocationSize = 1)
	@Column(name = "_id")
	private Integer id;
	@Column(name = "bdga_ubicacion")
	private String ubicacion;
	@Column(name = "bdga_numero")
	private String numero;
	@Column(name = "bdga_estado")
	private String estado;

	// relacion(padre)
	@OneToMany(mappedBy = "bodega", cascade = CascadeType.ALL)
//	@OneToMany(mappedBy = "bodega")
	private List<Producto> productos;

//	GET AND SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
