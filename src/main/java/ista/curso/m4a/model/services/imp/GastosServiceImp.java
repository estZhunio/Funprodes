package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IGastoDao;
import ista.curso.m4a.model.entity.Gastos;
import ista.curso.m4a.model.services.IGastosService;

@Service
public class GastosServiceImp implements IGastosService {

	@Autowired
	private IGastoDao gastoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Gastos> findAll() {
		// TODO Auto-generated method stub
		return (List<Gastos>) gastoDao.findAll();
	}

	@Override
	@Transactional
	public Gastos save(Gastos gasto) {
		
		return gastoDao.save(gasto);
	}

	@Override
	@Transactional(readOnly = true)
	public Gastos findById(Long id) {
		
		return gastoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		gastoDao.deleteById(id);
		
	}

}
