package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IInmobiliarioDao;
import ista.curso.m4a.model.entity.Inmobiliarios;
import ista.curso.m4a.model.services.IInmobiliariosService;

@Service
public class InmobiliariosServiceImp implements IInmobiliariosService {

	@Autowired
	private IInmobiliarioDao inmobiliarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Inmobiliarios> findAll() {
		// TODO Auto-generated method stub
		return (List<Inmobiliarios>) inmobiliarioDao.findAll();
	}

	@Override
	@Transactional
	public Inmobiliarios save(Inmobiliarios inmobiliario) {
		// TODO Auto-generated method stub
		return inmobiliarioDao.save(inmobiliario);
	}

	@Override
	@Transactional(readOnly = true)
	public Inmobiliarios findById(Long id) {
		// TODO Auto-generated method stub
		return inmobiliarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		inmobiliarioDao.deleteById(id);
	}

}
