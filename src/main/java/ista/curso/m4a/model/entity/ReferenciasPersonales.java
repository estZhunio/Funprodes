package ista.curso.m4a.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

// Bryan Farez
@Entity
@Table(name = "referencias_personales", uniqueConstraints = {@UniqueConstraint(columnNames = {"socio_id"})})
public class ReferenciasPersonales implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String parentesco;
	private boolean confirmacion;
	
	

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



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getParentesco() {
		return parentesco;
	}



	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}



	public boolean isConfirmacion() {
		return confirmacion;
	}



	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
