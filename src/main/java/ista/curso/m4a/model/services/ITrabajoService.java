package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Trabajo;

public interface ITrabajoService {
	public List<Trabajo> findAll();
	public Trabajo save(Trabajo trabajo);
	public Trabajo findById(Long id);
	public void delete(Long id);
}
