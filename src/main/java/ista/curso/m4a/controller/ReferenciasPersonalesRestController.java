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

import ista.curso.m4a.model.entity.ReferenciasPersonales;
import ista.curso.m4a.model.services.IReferenciasPersonalesService;

@RestController
@RequestMapping("/api")
public class ReferenciasPersonalesRestController {

	@Autowired
	private IReferenciasPersonalesService referenciasService;
	
	//lista
	@GetMapping("/referencias")
	public List<ReferenciasPersonales> index(){
		return referenciasService.findAll();
	}
	//buscar por id
	@GetMapping("/referencias/{id}")
	public ReferenciasPersonales show(@PathVariable Long id) {
		return referenciasService.findById(id);
	}
	//guardar
	@PostMapping("/referencias")
	@ResponseStatus(HttpStatus.CREATED)
	public ReferenciasPersonales create(@RequestBody ReferenciasPersonales referencias) {
		return referenciasService.save(referencias);
	}
	//modificar
	@PutMapping("/referencias/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ReferenciasPersonales update(@RequestBody ReferenciasPersonales referencias,@PathVariable Long id) {
		ReferenciasPersonales referenciasActual=referenciasService.findById(id);
		
		referenciasActual.setNombre(referencias.getNombre());
		referenciasActual.setApellido(referencias.getApellido());
		referenciasActual.setDireccion(referencias.getDireccion());
		referenciasActual.setTelefono(referencias.getTelefono());
		referenciasActual.setParentesco(referencias.getParentesco());
		referenciasActual.setConfirmacion(referencias.isConfirmacion());
		
		return referenciasService.save(referencias);
	}
	//eliminar
	@DeleteMapping("/referencias/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		referenciasService.delete(id);
	}
}
