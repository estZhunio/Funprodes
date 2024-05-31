package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Credito;


public interface ICreditoService {
	
	public List<Credito> findAll();
	public Credito save(Credito credito);
	public Credito findById(Long id);
	public void delete();

}
