package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Inmobiliarios;


public interface IInmobiliariosService {
	public List<Inmobiliarios> findAll();
	public Inmobiliarios save(Inmobiliarios inmobiliario);
	public Inmobiliarios findById(Long id);
	public void delete(Long id);
}
