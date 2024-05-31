package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IPasivoDao;
import ista.curso.m4a.model.entity.Pasivos;
import ista.curso.m4a.model.services.IPasivosService;

@Service
public class PasivosServiceImp implements IPasivosService{

	@Autowired
	private IPasivoDao pasivoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Pasivos> findAll() {
		
		return (List<Pasivos>) pasivoDao.findAll();
	}

	@Override
	@Transactional
	public Pasivos save(Pasivos pasivo) {
		return pasivoDao.save(pasivo);
	}

	@Override
	@Transactional(readOnly = true)
	public Pasivos findById(Long id) {
		return pasivoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		pasivoDao.deleteById(id);
		
	}

}
