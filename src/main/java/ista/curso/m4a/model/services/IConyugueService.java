package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Conyugue;


public interface IConyugueService {
	public List<Conyugue> findAll();
	public Conyugue save(Conyugue conyugue);
	public Conyugue findById(Long id);
	public void delete(Long id);
}
