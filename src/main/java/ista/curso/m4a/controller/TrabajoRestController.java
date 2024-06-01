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

import ista.curso.m4a.model.entity.Trabajo;
import ista.curso.m4a.model.services.ITrabajoService;

@RestController
@RequestMapping("/api")
public class TrabajoRestController {

	@Autowired
	private ITrabajoService trabajoService;
	
	//listar
	@GetMapping("/trabajo")
	public List<Trabajo> index(){
		return trabajoService.findAll();
	}
	
	//buscar por id
	@GetMapping("/trabajo/{id}")
	public Trabajo show(@PathVariable Long id) {
		return trabajoService.findById(id);
	}
	
	//guardar
	@PostMapping("/trabajo")
	@ResponseStatus(HttpStatus.CREATED)
	public Trabajo create(@RequestBody Trabajo trabajo) {
		return trabajoService.save(trabajo);
	}
	
	//modi
	@PutMapping("/trabajo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Trabajo update(@RequestBody Trabajo trabajo,@PathVariable Long id) {
		Trabajo trabajoActual=trabajoService.findById(id);
		
		trabajoActual.setNombre(trabajo.getNombre());
		trabajoActual.setDireccion(trabajo.getDireccion());
		trabajoActual.setOcupacio(trabajo.getOcupacio());
		trabajoActual.setArea(trabajo.getArea());
		trabajoActual.setTelefono(trabajo.getTelefono());
		trabajoActual.setAniosTrabajados(trabajo.getAniosTrabajados());
		
		return trabajoService.save(trabajoActual);
	}
	
	//eliminar
	@DeleteMapping("/trabajo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		trabajoService.delete(id);
	}
}
