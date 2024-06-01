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

import ista.curso.m4a.model.entity.Credito;
import ista.curso.m4a.model.services.ICreditoService;

@RestController
@RequestMapping("/api")
public class CreditoRestController {

	@Autowired
	private ICreditoService creditoService;
	// listar
	@GetMapping("/creditos")
	public List<Credito> index(){
		return creditoService.findAll();
	}
	// buscar por id
	@GetMapping("/creditos/{id}")
	public Credito show(@PathVariable Long id) {
		return creditoService.findById(id);
	}
	
	// guardar
	@PostMapping("/creditos")
	@ResponseStatus(HttpStatus.CREATED)
	public Credito create(@RequestBody Credito credito) {
		return creditoService.save(credito);
	}
	
	// modificar
	@PutMapping("/credito/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Credito update(@RequestBody Credito credito,@PathVariable Long id) {
		Credito creditoActual= creditoService.findById(id);
		
		creditoActual.setFechaSolicitud(credito.getFechaSolicitud());
		creditoActual.setPlazo(credito.getPlazo());
		creditoActual.setValorSolicitado(credito.getValorSolicitado());
		creditoActual.setProvincia(credito.getProvincia());
		creditoActual.setCiudad(credito.getCiudad());
		creditoActual.setTipoCredito(credito.getTipoCredito());
		creditoActual.setEstado(credito.getEstado());
		creditoActual.setFormaPago(credito.getFormaPago());
		creditoActual.setInversion(credito.getInversion());
		
		return creditoService.save(creditoActual);
	
	}
	// eliminar
	@DeleteMapping("/credito/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		creditoService.delete(id);
	}
}
