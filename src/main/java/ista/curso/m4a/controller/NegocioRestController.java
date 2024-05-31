package ista.curso.m4a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ista.curso.m4a.model.entity.Negocio;
import ista.curso.m4a.model.services.INegocioService;

@RestController
@RequestMapping("/api")
public class NegocioRestController {

	@Autowired
	private INegocioService negocioService;
	
	@GetMapping("/negocios")
	public List<Negocio> index() {
		return negocioService.findAll();
	}
	
	@GetMapping("/negocios/{id}")
	public Negocio show(@PathVariable Long id) {
		return negocioService.findById(id);
	}
	
	@PostMapping("/negocios")
	@ResponseStatus(HttpStatus.CREATED)
	public Negocio create(@RequestBody Negocio negocio) {
		return negocioService.save(negocio);
	}
	
	@PutMapping("/negocios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Negocio update(@RequestBody Negocio negocio, @PathVariable Long id) {
		Negocio negocioActual = negocioService.findById(id);
		
		negocioActual.setRazonSocial(negocio.getRazonSocial());
		negocioActual.setActividad(negocio.getActividad());
		negocioActual.setActividadNegocio(negocio.getActividadNegocio());
		negocioActual.setAntiguedad(negocio.getAntiguedad());
		negocioActual.setNumeroCasa(negocio.getNumeroCasa());
		negocioActual.setLugarVentas(negocio.getLugarVentas());
		negocioActual.setTiempoLocal(negocio.getTiempoLocal());
		negocioActual.setReferencia(negocio.getReferencia());
		negocioActual.setSubactividad(negocio.getSubactividad());
		negocioActual.setHipotecado(negocio.isHipotecado());
		negocioActual.setNumeroEmpleados(negocio.getNumeroEmpleados());
		negocioActual.setLocales(negocio.getLocales());
		negocioActual.setInstitucion(negocio.getInstitucion());
		negocioActual.setCuidad(negocio.getCuidad());
		negocioActual.setReferencia(negocio.getReferencia());
		negocioActual.setTelefono(negocio.getTelefono());
		
		
		return negocioService.save(negocioActual);
		
	}
	
	@DeleteMapping("/negocios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		negocioService.delete(id);
	}
	
	
}
