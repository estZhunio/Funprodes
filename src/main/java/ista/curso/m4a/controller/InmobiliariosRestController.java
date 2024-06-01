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

import ista.curso.m4a.model.entity.Inmobiliarios;
import ista.curso.m4a.model.services.IInmobiliariosService;

@RestController
@RequestMapping("/api")
public class InmobiliariosRestController {

	@Autowired
	private IInmobiliariosService inmobiliarioService;
	
	//lista
	@GetMapping("/inmobiliario")
	public List<Inmobiliarios> index(){
		return inmobiliarioService.findAll();
	}
	// buscar por id
	@GetMapping("/inmobiliario/{id}")
	public Inmobiliarios show(@PathVariable Long id) {
		return inmobiliarioService.findById(id);
	}
	// guardar
	@PostMapping("/inmobiliario")
	@ResponseStatus(HttpStatus.CREATED)
	public Inmobiliarios create(@RequestBody Inmobiliarios inmobiliario) {
		return inmobiliarioService.save(inmobiliario);
	}
	//modificar
	@PutMapping("/inmobiliario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Inmobiliarios update(@RequestBody Inmobiliarios inmobiliario,@PathVariable Long id) {
		Inmobiliarios inmobiliarioActual=inmobiliarioService.findById(id);
		
		inmobiliarioActual.setTipoPropiedad(inmobiliario.getTipoPropiedad());
		inmobiliarioActual.setDireccion(inmobiliario.getDireccion());
		inmobiliarioActual.setValor(inmobiliario.getValor());
		inmobiliarioActual.setHipotecado(inmobiliario.getHipotecado());
		inmobiliarioActual.setInstitucion(inmobiliario.getInstitucion());
		
		return inmobiliarioService.save(inmobiliarioActual);
	}
	//eliminar
	@DeleteMapping("/inmobiliario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		inmobiliarioService.delete(id);
	}
}
