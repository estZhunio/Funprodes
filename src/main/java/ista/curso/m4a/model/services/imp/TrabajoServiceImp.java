package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.ITrabajoDao;
import ista.curso.m4a.model.entity.Trabajo;
import ista.curso.m4a.model.services.ITrabajoService;
@Service
public class TrabajoServiceImp implements ITrabajoService{

	@Autowired
	private ITrabajoDao trabajoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Trabajo> findAll() {
		// TODO Auto-generated method stub
		return (List<Trabajo>) trabajoDao.findAll();
	}

	@Override
	@Transactional
	public Trabajo save(Trabajo trabajo) {
		// TODO Auto-generated method stub
		return trabajoDao.save(trabajo);
	}

	@Override
	@Transactional(readOnly = true)
	public Trabajo findById(Long id) {
		// TODO Auto-generated method stub
		return trabajoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		trabajoDao.deleteById(id);
	}

}
