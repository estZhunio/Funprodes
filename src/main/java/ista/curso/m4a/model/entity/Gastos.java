package ista.curso.m4a.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//bryan
@Entity
@Table(name = "gastos")
public class Gastos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double alimentacion;
	private double arriendo;
	private double serviciosBasico;
	private double educacion;
	private double salud;
	private double deudas;
	private double vestimenta;
	private double pensiones;
	private double transporte;
	private double otrosEgresos;
	private double totalGastos;
	
	@OneToOne
	@JoinColumn(name = "socio_id", referencedColumnName = "id")
	private Socio socio;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getAlimentacion() {
		return alimentacion;
	}


	public void setAlimentacion(double alimentacion) {
		this.alimentacion = alimentacion;
	}


	public double getArriendo() {
		return arriendo;
	}


	public void setArriendo(double arriendo) {
		this.arriendo = arriendo;
	}


	public double getServiciosBasico() {
		return serviciosBasico;
	}


	public void setServiciosBasico(double serviciosBasico) {
		this.serviciosBasico = serviciosBasico;
	}


	public double getEducacion() {
		return educacion;
	}


	public void setEducacion(double educacion) {
		this.educacion = educacion;
	}


	public double getSalud() {
		return salud;
	}


	public void setSalud(double salud) {
		this.salud = salud;
	}


	public double getDeudas() {
		return deudas;
	}


	public void setDeudas(double deudas) {
		this.deudas = deudas;
	}


	public double getVestimenta() {
		return vestimenta;
	}


	public void setVestimenta(double vestimenta) {
		this.vestimenta = vestimenta;
	}


	public double getPensiones() {
		return pensiones;
	}


	public void setPensiones(double pensiones) {
		this.pensiones = pensiones;
	}


	public double getTransporte() {
		return transporte;
	}


	public void setTransporte(double transporte) {
		this.transporte = transporte;
	}


	public double getOtrosEgresos() {
		return otrosEgresos;
	}


	public void setOtrosEgresos(double otrosEgresos) {
		this.otrosEgresos = otrosEgresos;
	}


	public double getTotalGastos() {
		return alimentacion + arriendo + serviciosBasico + educacion + salud +
	               deudas + vestimenta + pensiones + transporte + otrosEgresos;
	}


	public void setTotalGastos(double totalGastos) {
		this.totalGastos = totalGastos;
	}

	

	public Long getSocio() {
		return socio.getId();
	}


	public void setSocio(Long socioId) {
		if (this.socio == null) {
	        this.socio = new Socio(); // Si socio es null, crea un nuevo objeto Socio
	    }
	    this.socio.setId(socioId); // Establece el ID del socio
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
