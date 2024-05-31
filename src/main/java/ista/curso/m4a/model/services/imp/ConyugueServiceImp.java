package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IConyugueDao;
import ista.curso.m4a.model.entity.Conyugue;
import ista.curso.m4a.model.services.IConyugueService;

@Service
public class ConyugueServiceImp implements IConyugueService {

	@Autowired
	private IConyugueDao conyugueDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Conyugue> findAll() {
		// TODO Auto-generated method stub
		return (List<Conyugue>) conyugueDao.findAll();
	}

	@Override
	@Transactional
	public Conyugue save(Conyugue conyugue) {
		// TODO Auto-generated method stub
		return conyugueDao.save(conyugue);
	}

	@Override
	@Transactional(readOnly = true)
	public Conyugue findById(Long id) {
		// TODO Auto-generated method stub
		return conyugueDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		conyugueDao.deleteById(id);
	}

}
