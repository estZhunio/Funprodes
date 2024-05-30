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

@Entity
@Table(name = "socios")
public class Socio implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String cedula;
	
	@Column(length = 50)
	private String nombres;
	
	@Column(length = 50)
	private String apellido;
	
	private String lugarNacimiento;
	private String profesion;
	private int numeroCasa;
	private String provincia;
	private String sector;
	
	@Column(unique = true)
	private String correo;
	
	private String tipoCasa;
	private int tiempoResidencia;
	private String genero;
	private String carpeta;
	
	@Column(name="fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	private String direccion;
	private String ciudad;
	private String referencia;
	private String celular;
	private String propietario;
	private String telefonoPropietario;
	private String estadoCivil;
	private String personasIndependientes;
	private String parroquia;
	private String telefono;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


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


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getLugarNacimiento() {
		return lugarNacimiento;
	}


	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public int getNumeroCasa() {
		return numeroCasa;
	}


	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTipoCasa() {
		return tipoCasa;
	}


	public void setTipoCasa(String tipoCasa) {
		this.tipoCasa = tipoCasa;
	}


	public int getTiempoResidencia() {
		return tiempoResidencia;
	}


	public void setTiempoResidencia(int tiempoResidencia) {
		this.tiempoResidencia = tiempoResidencia;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCarpeta() {
		return carpeta;
	}


	public void setCarpeta(String carpeta) {
		this.carpeta = carpeta;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getPropietario() {
		return propietario;
	}


	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	public String getTelefonoPropietario() {
		return telefonoPropietario;
	}


	public void setTelefonoPropietario(String telefonoPropietario) {
		this.telefonoPropietario = telefonoPropietario;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getPersonasIndependientes() {
		return personasIndependientes;
	}


	public void setPersonasIndependientes(String personasIndependientes) {
		this.personasIndependientes = personasIndependientes;
	}


	public String getParroquia() {
		return parroquia;
	}


	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
