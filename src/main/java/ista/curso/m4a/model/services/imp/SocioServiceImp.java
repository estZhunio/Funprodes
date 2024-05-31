package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.ISocioDao;
import ista.curso.m4a.model.entity.Socio;
import ista.curso.m4a.model.services.ISocioService;

public class SocioServiceImp implements ISocioService{
	
	@Autowired
	private ISocioDao socioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Socio> findAll() {
		
		return (List<Socio>) socioDao.findAll();
	}

	@Override
	@Transactional
	public Socio save(Socio socio) {
		// TODO Auto-generated method stub
		return socioDao.save(socio);
	}

	@Override
	@Transactional(readOnly = true)
	public Socio findById(Long id) {
		// TODO Auto-generated method stub
		return socioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		socioDao.deleteById(id);
		
	}

}
