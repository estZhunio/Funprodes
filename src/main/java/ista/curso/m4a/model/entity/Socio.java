package ista.curso.m4a.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
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
	private int personasDependientes;
	private String parroquia;
	private String telefono;
	

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "socio_id")
	private List<Conyugue> conyugues;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "socio_id")
	private List<Negocio> negocio;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "socio_id")
	private List<Inmobiliarios> inmobiliarios;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "socio_id")
	private List<Vehiculo> vehiculos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "socio_id")
	private List<Credito> creditos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "socio_id")
	private List<ReferenciasPersonales> refereciasPerson;
	
	
	@OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
	private Pasivos pasivo;
	
	@OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
	private Trabajo trabajo;
	
	@OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
	private Activos activo;
	
	@OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
	private Gastos gastos;
	
	@OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
	private Ingresos ingreso;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrePersist
	public void prePersist() {
		fechaNacimiento = new Date();
	}

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


	public int getPersonasDependientes() {
		return personasDependientes;
	}


	public void setPersonasDependientes(int personasDependientes) {
		this.personasDependientes = personasDependientes;
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

	public List<Conyugue> getConyugues() {
		return conyugues;
	}

	public void setConyugues(List<Conyugue> conyugues) {
		this.conyugues = conyugues;
	}

	public List<Negocio> getNegocio() {
		return negocio;
	}

	public void setNegocio(List<Negocio> negocio) {
		this.negocio = negocio;
	}

	public List<Inmobiliarios> getInmobiliarios() {
		return inmobiliarios;
	}

	public void setInmobiliarios(List<Inmobiliarios> inmobiliarios) {
		this.inmobiliarios = inmobiliarios;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public List<Credito> getCreditos() {
		return creditos;
	}

	public void setCreditos(List<Credito> creditos) {
		this.creditos = creditos;
	}

	public List<ReferenciasPersonales> getRefereciasPerson() {
		return refereciasPerson;
	}

	public void setRefereciasPerson(List<ReferenciasPersonales> refereciasPerson) {
		this.refereciasPerson = refereciasPerson;
	}

	public Pasivos getPasivo() {
		return pasivo;
	}

	public void setPasivo(Pasivos pasivo) {
		this.pasivo = pasivo;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Activos getActivo() {
		return activo;
	}

	public void setActivo(Activos activo) {
		this.activo = activo;
	}

	public Gastos getGastos() {
		return gastos;
	}

	public void setGastos(Gastos gastos) {
		this.gastos = gastos;
	}

	public Ingresos getIngreso() {
		return ingreso;
	}

	public void setIngreso(Ingresos ingreso) {
		this.ingreso = ingreso;
	}
	
	
	

	

}
