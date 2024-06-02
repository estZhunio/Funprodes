package ista.curso.m4a.model.entity;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


// Miguel Zhunio
@Entity
@Table(name = "pasivos")
public class Pasivos implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private double deudas_cooperativas;
	private double deudas_banco;
	private double deudas_proovedores;
	private double deudas_tarjetas_credito;
	private double deudas_almacenes;
	private double deudas_otras;
	private double total_pasivos;
	private double patromonio;
	private double total;
	
	@OneToOne
	@JoinColumn(name = "socio_id", referencedColumnName = "id")
	private Socio socio;
	

	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public double getDeudas_cooperativas() {
		return deudas_cooperativas;
	}






	public void setDeudas_cooperativas(double deudas_cooperativas) {
		this.deudas_cooperativas = deudas_cooperativas;
	}






	public double getDeudas_banco() {
		return deudas_banco;
	}






	public void setDeudas_banco(double deudas_banco) {
		this.deudas_banco = deudas_banco;
	}






	public double getDeudas_proovedores() {
		return deudas_proovedores;
	}






	public void setDeudas_proovedores(double deudas_proovedores) {
		this.deudas_proovedores = deudas_proovedores;
	}






	public double getDeudas_tarjetas_credito() {
		return deudas_tarjetas_credito;
	}






	public void setDeudas_tarjetas_credito(double deudas_tarjetas_credito) {
		this.deudas_tarjetas_credito = deudas_tarjetas_credito;
	}






	public double getDeudas_almacenes() {
		return deudas_almacenes;
	}






	public void setDeudas_almacenes(double deudas_almacenes) {
		this.deudas_almacenes = deudas_almacenes;
	}






	public double getDeudas_otras() {
		return deudas_otras;
	}






	public void setDeudas_otras(double deudas_otras) {
		this.deudas_otras = deudas_otras;
	}






	public double getTotal_pasivos() {
		return total_pasivos;
	}






	public void setTotal_pasivos(double total_pasivos) {
		this.total_pasivos = total_pasivos;
	}






	public double getPatromonio() {
		return patromonio;
	}






	public void setPatromonio(double patromonio) {
		this.patromonio = patromonio;
	}






	public double getTotal() {
		return total;
	}






	public void setTotal(double total) {
		this.total = total;
	}

	





	public Long getSocioId() {
	    return socio.getId();
	}








	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
