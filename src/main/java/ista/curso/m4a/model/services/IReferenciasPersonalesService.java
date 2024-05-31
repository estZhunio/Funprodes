package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.ReferenciasPersonales;

public interface IReferenciasPersonalesService {
	public List<ReferenciasPersonales> findAll();
	public ReferenciasPersonales save(ReferenciasPersonales referenciaPersonal);
	public ReferenciasPersonales findById(Long id);
	public void delete();
}
