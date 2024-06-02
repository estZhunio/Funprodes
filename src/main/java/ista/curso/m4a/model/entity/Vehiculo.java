package ista.curso.m4a.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "vehiculos", uniqueConstraints = {@UniqueConstraint(columnNames = {"socio_id"})})
public class Vehiculo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipoVehiculo;
	private String marca;
	private double valor;
	
	@Temporal(TemporalType.DATE)
	private Date anioFabricacion;
	
	@Column(unique = true)
	private String numeroPlaca;
	
	private String socio_id;// FK
	
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getTipoVehiculo() {
		return tipoVehiculo;
	}




	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	public Date getAnioFabricacion() {
		return anioFabricacion;
	}




	public void setAnioFabricacion(Date anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}




	public String getNumeroPlaca() {
		return numeroPlaca;
	}




	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}




	public String getSocio_id() {
		return socio_id;
	}




	public void setSocio_id(String socio_id) {
		this.socio_id = socio_id;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
