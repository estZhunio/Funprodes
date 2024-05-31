package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IActivoDao;
import ista.curso.m4a.model.entity.Activos;
import ista.curso.m4a.model.services.IActivosService;

public class ActivosServiceImp implements IActivosService{
	
	@Autowired
	private IActivoDao activoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Activos> findAll() {
		return (List<Activos>) activoDao.findAll();
	}

	@Override
	@Transactional
	public Activos save(Activos activo) {
		
		return activoDao.save(activo);
	}

	@Override
	@Transactional(readOnly = true)
	public Activos findById(Long id) {
		
		return activoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		activoDao.deleteById(id);
		
	}

}
