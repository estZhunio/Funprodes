package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Ingresos;


public interface IIngresosService {
	public List<Ingresos> findAll();
	public Ingresos save(Ingresos ingreso);
	public Ingresos findById(Long id);
	public void delete();
}
