package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IIngresosDao;
import ista.curso.m4a.model.entity.Ingresos;
import ista.curso.m4a.model.services.IIngresosService;

@Service
public class IngresosServiceImp implements IIngresosService{
	
	@Autowired
	private IIngresosDao ingresoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Ingresos> findAll() {
		
		return (List<Ingresos>) ingresoDao.findAll();
	}

	@Override
	@Transactional
	public Ingresos save(Ingresos ingreso) {
		return ingresoDao.save(ingreso);
	}

	@Override
	@Transactional(readOnly = true)
	public Ingresos findById(Long id) {
		return ingresoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		ingresoDao.deleteById(id);
		
	}

}
