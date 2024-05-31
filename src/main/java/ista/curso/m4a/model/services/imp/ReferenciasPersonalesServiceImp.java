package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IReferenciaPersonalDao;
import ista.curso.m4a.model.entity.ReferenciasPersonales;
import ista.curso.m4a.model.services.IReferenciasPersonalesService;
@Service
public class ReferenciasPersonalesServiceImp implements IReferenciasPersonalesService {

	@Autowired
	private IReferenciaPersonalDao referenciaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ReferenciasPersonales> findAll() {
		// TODO Auto-generated method stub
		return (List<ReferenciasPersonales>) referenciaDao.findAll();
	}

	@Override
	@Transactional
	public ReferenciasPersonales save(ReferenciasPersonales referenciaPersonal) {
		// TODO Auto-generated method stub
		return referenciaDao.save(referenciaPersonal);
	}

	@Override
	@Transactional(readOnly = true)
	public ReferenciasPersonales findById(Long id) {
		// TODO Auto-generated method stub
		return referenciaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		referenciaDao.deleteById(id);
	}

}
