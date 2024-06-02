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

// Miguel Zhunio
@Entity
@Table(name = "creditos", uniqueConstraints = {@UniqueConstraint(columnNames = {"socio_id"})})
public class Credito implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroSolicitud;
	
	@Column(name="fecha_solicitud")
	@Temporal(TemporalType.DATE)
	private Date fechaSolicitud;
	
	private int plazo;
	private double valorSolicitado;
	private String provincia;
	private String ciudad;
	private String tipoCredito;
	private String estado;
	private String formaPago;
	private String inversion;
	private String socio_id;// FK
	
	
	
	
	public Long getNumeroSolicitud() {
		return numeroSolicitud;
	}





	public void setNumeroSolicitud(Long numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}





	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}





	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}





	public int getPlazo() {
		return plazo;
	}





	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}





	public double getValorSolicitado() {
		return valorSolicitado;
	}





	public void setValorSolicitado(double valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}





	public String getProvincia() {
		return provincia;
	}





	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}





	public String getCiudad() {
		return ciudad;
	}





	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}





	public String getTipoCredito() {
		return tipoCredito;
	}





	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}





	public String getEstado() {
		return estado;
	}





	public void setEstado(String estado) {
		this.estado = estado;
	}





	public String getFormaPago() {
		return formaPago;
	}





	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}





	public String getInversion() {
		return inversion;
	}





	public void setInversion(String inversion) {
		this.inversion = inversion;
	}





	public String getSocio_id() {
		return socio_id;
	}





	public void setSocio_id(String socio_id) {
		this.socio_id = socio_id;
	}





	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
