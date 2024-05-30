package ista.curso.m4a.model.entity;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Credito implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroSolicitud;

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
