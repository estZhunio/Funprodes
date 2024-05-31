package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Negocio;

public interface INegocioService {
	public List<Negocio> findAll();
	public Negocio save(Negocio negocio);
	public Negocio findById(Long id);
	public void delete(Long id);
}
