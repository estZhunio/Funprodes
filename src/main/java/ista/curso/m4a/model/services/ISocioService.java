package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Socio;

public interface ISocioService {
	public List<Socio> findAll();
	public Socio save(Socio socio);
	public Socio findById(Long id);
	public void delete(Long id);
}
