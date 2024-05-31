package ista.curso.m4a.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "negocios",uniqueConstraints = {@UniqueConstraint(columnNames = {"socio_id"})})
public class Negocio implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String razonSocial;
	private String actividad;
	private String actividadNegocio;
	private int antiguedad;
	private String lugarVentas;
	private int tiempoLocal;
	private String cuidad;
	private String referencia;
	private String subactividad;
	private boolean hipotecado;
	private String direccion;
	private String ruc;
	private int numeroEmpleados;
	private String localEs;
	private String institucion;
	private int numeroCasa;
	private String telefono;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getActividad() {
		return actividad;
	}


	public void setActividad(String actividad) {
		this.actividad = actividad;
	}


	public String getActividadNegocio() {
		return actividadNegocio;
	}


	public void setActividadNegocio(String actividadNegocio) {
		this.actividadNegocio = actividadNegocio;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	public String getLugarVentas() {
		return lugarVentas;
	}


	public void setLugarVentas(String lugarVentas) {
		this.lugarVentas = lugarVentas;
	}


	public int getTiempoLocal() {
		return tiempoLocal;
	}


	public void setTiempoLocal(int tiempoLocal) {
		this.tiempoLocal = tiempoLocal;
	}


	public String getCuidad() {
		return cuidad;
	}


	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getSubactividad() {
		return subactividad;
	}


	public void setSubactividad(String subactividad) {
		this.subactividad = subactividad;
	}


	public boolean isHipotecado() {
		return hipotecado;
	}


	public void setHipotecado(boolean hipotecado) {
		this.hipotecado = hipotecado;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}


	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}


	public String getLocalEs() {
		return localEs;
	}


	public void setLocalEs(String localEs) {
		this.localEs = localEs;
	}


	public String getInstitucion() {
		return institucion;
	}


	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}


	public int getNumeroCasa() {
		return numeroCasa;
	}


	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
