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

//bryan Farez

@Entity
@Table(name="conyugue")
public class Conyugue implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String cedula;
	@Column(length = 50)
	private String nombre;
	@Column(length = 50)
	private String apellido;
	
	private String profesion;
	private String ocupacion;
	private String area;
	private String direccion;
	private String telefono;
	
	@Column(name = "Fecha_Nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	private String socio_id;// FK
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// getter y setter
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
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


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public String getOcupacion() {
		return ocupacion;
	}


	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
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


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getSocio_id() {
		return socio_id;
	}


	public void setSocio_id(String socio_id) {
		this.socio_id = socio_id;
	}

	
}
