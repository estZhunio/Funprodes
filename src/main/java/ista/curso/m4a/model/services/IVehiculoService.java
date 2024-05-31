package ista.curso.m4a.model.services;

import java.util.List;

import ista.curso.m4a.model.entity.Vehiculo;

public interface IVehiculoService {
	public List<Vehiculo> findAll();
	public Vehiculo save(Vehiculo vehiculo);
	public Vehiculo findById(Long id);
	public void delete();
}
