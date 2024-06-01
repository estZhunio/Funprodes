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

import ista.curso.m4a.model.entity.Pasivos;
import ista.curso.m4a.model.services.IPasivosService;

@RestController
@RequestMapping("/api")
public class PasivoRestController {

	@Autowired
	private IPasivosService pasivoService;
	
	@GetMapping("/pasivos")
	public List<Pasivos> index() {
		return pasivoService.findAll();
	}
	
	@GetMapping("/pasivos/{id}")
	public Pasivos show(@PathVariable Long id) {
		return pasivoService.findById(id);
	}
	
	@PostMapping("/pasivos")
	@ResponseStatus(HttpStatus.CREATED)
	public Pasivos create(@RequestBody Pasivos pasivo) {
		return pasivoService.save(pasivo);
	}
	
	@PutMapping("/pasivos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pasivos update(@RequestBody Pasivos pasivo, @PathVariable Long id) {
		Pasivos pasivoActual = pasivoService.findById(id);
		
		pasivoActual.setDeudas_cooperativas(pasivo.getDeudas_cooperativas());
		pasivoActual.setDeudas_banco(pasivo.getDeudas_banco());
		pasivoActual.setDeudas_proovedores(pasivo.getDeudas_proovedores());
		pasivoActual.setDeudas_tarjetas_credito(pasivo.getDeudas_tarjetas_credito());
		pasivoActual.setDeudas_almacenes(pasivo.getDeudas_almacenes());
		pasivoActual.setDeudas_otras(pasivo.getDeudas_otras());
		
		
		return pasivoService.save(pasivoActual);
		
	}
	
	@DeleteMapping("/pasivos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pasivoService.delete(id);
	}
	
	
}
