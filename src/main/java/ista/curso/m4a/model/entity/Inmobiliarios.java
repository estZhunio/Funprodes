package ista.curso.m4a.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

//bryan
@Entity
@Table(name = "Inmobiliarios", uniqueConstraints = {@UniqueConstraint(columnNames = {"socio_id"})})
public class Inmobiliarios implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String TipoPropiedad;
	private String direccion;
	private double valor;
	private Boolean hipotecado;
	private String institucion;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTipoPropiedad() {
		return TipoPropiedad;
	}


	public void setTipoPropiedad(String tipoPropiedad) {
		TipoPropiedad = tipoPropiedad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Boolean getHipotecado() {
		return hipotecado;
	}


	public void setHipotecado(Boolean hipotecado) {
		this.hipotecado = hipotecado;
	}


	public String getInstitucion() {
		return institucion;
	}


	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
