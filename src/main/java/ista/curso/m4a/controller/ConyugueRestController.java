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

import ista.curso.m4a.model.entity.Conyugue;
import ista.curso.m4a.model.services.IConyugueService;

@RestController
@RequestMapping("/api")
public class ConyugueRestController {

	@Autowired
	private IConyugueService conyugueService;
	//listar 
	@GetMapping("/conyugue")
	public List<Conyugue> index(){
		return conyugueService.findAll();
	}
	
	// buscar por id
	@GetMapping("/conyugue/{id}")
	public Conyugue show(@PathVariable Long id) {
		return conyugueService.findById(id);
	}
	
	// guardar 
	@PostMapping("/conyugue")
	@ResponseStatus(HttpStatus.CREATED)
	public Conyugue create(@RequestBody Conyugue conyugue) {
		return conyugueService.save(conyugue);
	}
	
	// modificar
	@PutMapping("/conyugue/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Conyugue update(@RequestBody Conyugue conyugue,@PathVariable Long id ) {
		Conyugue conyugueActual= conyugueService.findById(id);
		
		conyugueActual.setNombre(conyugue.getNombre());
		conyugueActual.setApellido(conyugue.getApellido());
		conyugueActual.setProfesion(conyugue.getProfesion());
		conyugueActual.setOcupacion(conyugue.getOcupacion());
		conyugueActual.setArea(conyugue.getArea());
		conyugueActual.setDireccion(conyugue.getDireccion());
		conyugueActual.setTelefono(conyugue.getTelefono());
		conyugueActual.setFechaNacimiento(conyugue.getFechaNacimiento());
		
		return conyugueService.save(conyugueActual);
	}
	
	// eliminar
	@DeleteMapping("/conyugue/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void  delete(@PathVariable Long id) {
		conyugueService.delete(id);
	}
	
	
}
