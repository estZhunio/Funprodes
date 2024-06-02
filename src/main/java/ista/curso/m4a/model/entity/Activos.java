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
@Table(name = "activos")
public class Activos implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private double efectivo;
	private double depositos_financieros;
	private double cuentas_cobrar;
	private double inventario_mercaderia;
	private double inversion_cultivos;
	private double inversion_ganado;
	private double muebles;
	private double herramientas_maquinaria;
	private double vehiculos;
	private double bienes_inmuebles;
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





	public double getEfectivo() {
		return efectivo;
	}





	public void setEfectivo(double efectivo) {
		this.efectivo = efectivo;
	}





	public double getDepositos_financieros() {
		return depositos_financieros;
	}





	public void setDepositos_financieros(double depositos_financieros) {
		this.depositos_financieros = depositos_financieros;
	}





	public double getCuentas_cobrar() {
		return cuentas_cobrar;
	}





	public void setCuentas_cobrar(double cuentas_cobrar) {
		this.cuentas_cobrar = cuentas_cobrar;
	}





	public double getInventario_mercaderia() {
		return inventario_mercaderia;
	}





	public void setInventario_mercaderia(double inventario_mercaderia) {
		this.inventario_mercaderia = inventario_mercaderia;
	}





	public double getInversion_cultivos() {
		return inversion_cultivos;
	}





	public void setInversion_cultivos(double inversion_cultivos) {
		this.inversion_cultivos = inversion_cultivos;
	}





	public double getInversion_ganado() {
		return inversion_ganado;
	}





	public void setInversion_ganado(double inversion_ganado) {
		this.inversion_ganado = inversion_ganado;
	}





	public double getMuebles() {
		return muebles;
	}





	public void setMuebles(double muebles) {
		this.muebles = muebles;
	}





	public double getHerramientas_maquinaria() {
		return herramientas_maquinaria;
	}





	public void setHerramientas_maquinaria(double herramientas_maquinaria) {
		this.herramientas_maquinaria = herramientas_maquinaria;
	}





	public double getVehiculos() {
		return vehiculos;
	}





	public void setVehiculos(double vehiculos) {
		this.vehiculos = vehiculos;
	}





	public double getBienes_inmuebles() {
		return bienes_inmuebles;
	}





	public void setBienes_inmuebles(double bienes_inmuebles) {
		this.bienes_inmuebles = bienes_inmuebles;
	}





	public double getTotal() {
		return total;
	}





	public void setTotal(double total) {
		this.total = total;
	}


	public Long getSocio() {
		return socio.getId();
	}





	public void setSocio(Socio socio) {
		this.socio = socio;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
