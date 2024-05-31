package ista.curso.m4a.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.curso.m4a.model.entity.Inmobiliarios;

public interface IInmobiliarioDao extends CrudRepository<Inmobiliarios, Long>{

}
