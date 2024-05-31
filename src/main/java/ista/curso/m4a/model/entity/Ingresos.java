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
@Table(name = "ingresos")
public class Ingresos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double sueldo;
	private double sueldoConyugue;
	private double comercio;
	private double agricultura;
	private double ganaderia;
	private double arriendos;
	private double alquilerVehiculos;
	private double pensiones;
	private double intereses;
	private double otrosIngresos;
	private double totalIngresos;
	
	@OneToOne
	@JoinColumn(name = "socio_id", referencedColumnName = "id")
	private Socio socio;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public double getSueldoConyugue() {
		return sueldoConyugue;
	}


	public void setSueldoConyugue(double sueldoConyugue) {
		this.sueldoConyugue = sueldoConyugue;
	}


	public double getComercio() {
		return comercio;
	}


	public void setComercio(double comercio) {
		this.comercio = comercio;
	}


	public double getAgricultura() {
		return agricultura;
	}


	public void setAgricultura(double agricultura) {
		this.agricultura = agricultura;
	}


	public double getGanaderia() {
		return ganaderia;
	}


	public void setGanaderia(double ganaderia) {
		this.ganaderia = ganaderia;
	}


	public double getArriendos() {
		return arriendos;
	}


	public void setArriendos(double arriendos) {
		this.arriendos = arriendos;
	}


	public double getAlquilerVehiculos() {
		return alquilerVehiculos;
	}


	public void setAlquilerVehiculos(double alquilerVehiculos) {
		this.alquilerVehiculos = alquilerVehiculos;
	}


	public double getPensiones() {
		return pensiones;
	}


	public void setPensiones(double pensiones) {
		this.pensiones = pensiones;
	}


	public double getIntereses() {
		return intereses;
	}


	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}


	public double getOtrosIngresos() {
		return otrosIngresos;
	}


	public void setOtrosIngresos(double otrosIngresos) {
		this.otrosIngresos = otrosIngresos;
	}


	public double getTotalIngresos() {
		return totalIngresos;
	}


	public void setTotalIngresos(double totalIngresos) {
		this.totalIngresos = totalIngresos;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
