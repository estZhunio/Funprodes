package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.INegocioDao;
import ista.curso.m4a.model.entity.Negocio;
import ista.curso.m4a.model.services.INegocioService;

public class NegocioServiceImp implements INegocioService{

	@Autowired
	private INegocioDao negocioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Negocio> finAll() {
		// TODO Auto-generated method stub
		return (List<Negocio>) negocioDao.findAll();
	}

	@Override
	@Transactional
	public Negocio save(Negocio negocio) {
		return negocioDao.save(negocio);
	}

	@Override
	@Transactional(readOnly = true)
	public Negocio findById(Long id) {
		return negocioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		negocioDao.deleteById(id);
		
	}

}
