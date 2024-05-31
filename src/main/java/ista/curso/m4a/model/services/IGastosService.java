package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Gastos;


public interface IGastosService {
	public List<Gastos> findAll();
	public Gastos save(Gastos gasto);
	public Gastos findById(Long id);
	public void delete();
}
