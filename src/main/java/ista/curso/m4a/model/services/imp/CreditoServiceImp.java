package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.ICreditoDao;
import ista.curso.m4a.model.entity.Credito;
import ista.curso.m4a.model.services.ICreditoService;
@Service
public class CreditoServiceImp implements ICreditoService{

	@Autowired
	private ICreditoDao creditoDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Credito> findAll() {
		// TODO Auto-generated method stub
		return (List<Credito>) creditoDao.findAll();
	}

	@Override
	@Transactional
	public Credito save(Credito credito) {
		// TODO Auto-generated method stub
		return creditoDao.save(credito);
	}

	@Override
	@Transactional(readOnly = true)
	public Credito findById(Long id) {
		// TODO Auto-generated method stub
		return creditoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		creditoDao.deleteById(id);
	}

}
