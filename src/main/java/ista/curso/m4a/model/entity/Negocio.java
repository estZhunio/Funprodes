package ista.curso.m4a.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "negocios",uniqueConstraints = {@UniqueConstraint(columnNames = {"socio_id"})})
public class Negocio implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String razonSocial;
	private String actividad;
	private String actividadNegocio;
	private int antiguedad;
	private String lugarVentas;
	private int tiempoLocal;
	private String cuidad;
	private String referencia;
	private String subactividad;
	private boolean hipotecado;
	private String direccion;
	private String ruc;
	private int numeroEmpleados;
	private String localEs;
	private String institucion;
	private int numeroCasa;
	private String telefono;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
