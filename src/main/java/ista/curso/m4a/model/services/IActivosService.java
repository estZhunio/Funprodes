package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Activos;

public interface IActivosService {
	public List<Activos> findAll();
	public Activos save(Activos activo);
	public Activos findById(Long id);
	public void delete(Long id);
}
