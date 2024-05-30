package ista.curso.m4a.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//bryan
@Entity
@Table(name = "trabajo")
public class Trabajo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String direccion;
	private String ocupacio;
	private String area;
	private String telefono;
	private int aniosTrabajados;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getOcupacio() {
		return ocupacio;
	}



	public void setOcupacio(String ocupacio) {
		this.ocupacio = ocupacio;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public int getAniosTrabajados() {
		return aniosTrabajados;
	}



	public void setAniosTrabajados(int aniosTrabajados) {
		this.aniosTrabajados = aniosTrabajados;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
