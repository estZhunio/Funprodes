package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Pasivos;

public interface IPasivosService {
	public List<Pasivos> findAll();
	public Pasivos save(Pasivos pasivo);
	public Pasivos findById(Long id);
	public void delete();
}
