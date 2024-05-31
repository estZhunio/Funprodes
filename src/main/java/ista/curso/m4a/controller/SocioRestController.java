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

import ista.curso.m4a.model.entity.Socio;
import ista.curso.m4a.model.services.ISocioService;

@RestController
@RequestMapping("/api")
public class SocioRestController {

	@Autowired
	private ISocioService socioService;
	
	@GetMapping("/socios")
	public List<Socio> index() {
		return socioService.findAll();
	}
	
	@GetMapping("/socios/{id}")
	public Socio show(@PathVariable Long id) {
		return socioService.findById(id);
	}
	
	@PostMapping("/socios")
	@ResponseStatus(HttpStatus.CREATED)
	public Socio create(@RequestBody Socio socio) {
		return socioService.save(socio);
	}
	
	@PutMapping("/socios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Socio update(@RequestBody Socio socio, @PathVariable Long id) {
		Socio socioActual = socioService.findById(id);
		
		socioActual.setNombres(socio.getNombres());
		socioActual.setApellido(socio.getApellido());
		socioActual.setLugarNacimiento(socio.getLugarNacimiento());
		socioActual.setProfesion(socio.getProfesion());
		socioActual.setNumeroCasa(socio.getNumeroCasa());
		socioActual.setProvincia(socio.getProvincia());
		socioActual.setSector(socio.getSector());
		socioActual.setCorreo(socio.getCorreo());
		socioActual.setTipoCasa(socio.getTipoCasa());
		socioActual.setTiempoResidencia(socio.getTiempoResidencia());
		socioActual.setGenero(socio.getGenero());
		socioActual.setCarpeta(socio.getCarpeta());
		socioActual.setFechaNacimiento(socio.getFechaNacimiento());
		socioActual.setDireccion(socio.getDireccion());
		socioActual.setCiudad(socio.getCiudad());
		socioActual.setReferencia(socio.getReferencia());
		socioActual.setCelular(socio.getCelular());
		socioActual.setPropietario(socio.getPropietario());
		socioActual.setTelefonoPropietario(socio.getTelefonoPropietario());
		socioActual.setEstadoCivil(socio.getEstadoCivil());
		socioActual.setPersonasDependientes(socio.getPersonasDependientes());
		socioActual.setDireccion(socio.getDireccion());
		socioActual.setParroquia(socio.getParroquia());
		socioActual.setTelefono(socio.getTelefono());
		
		
		return socioService.save(socioActual);
		
	}
	
	@DeleteMapping("/socios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		socioService.delete(id);
	}
	
	
}
