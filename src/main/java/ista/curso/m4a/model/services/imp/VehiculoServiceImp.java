package ista.curso.m4a.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.curso.m4a.model.dao.IVehiculoDao;
import ista.curso.m4a.model.entity.Vehiculo;
import ista.curso.m4a.model.services.IVehiculoService;
@Service
public class VehiculoServiceImp implements IVehiculoService {

	@Autowired
	private IVehiculoDao vehiculoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

	@Override
	@Transactional
	public Vehiculo save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculoDao.save(vehiculo);
	}

	@Override
	@Transactional(readOnly = true)
	public Vehiculo findById(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		vehiculoDao.deleteById(id);
	}

}
