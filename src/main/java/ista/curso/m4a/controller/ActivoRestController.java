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

import ista.curso.m4a.model.entity.Activos;
import ista.curso.m4a.model.services.IActivosService;

@RestController
@RequestMapping("/api")
public class ActivoRestController {

	@Autowired
	private IActivosService activoService;
	
	@GetMapping("/activos")
	public List<Activos> index() {
		return activoService.findAll();
	}
	
	@GetMapping("/activos/{id}")
	public Activos show(@PathVariable Long id) {
		return activoService.findById(id);
	}
	
	@PostMapping("/activos")
	@ResponseStatus(HttpStatus.CREATED)
	public Activos create(@RequestBody Activos activo) {
		return activoService.save(activo);
	}
	
	@PutMapping("/activos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Activos update(@RequestBody Activos activos, @PathVariable Long id) {
		Activos activoActual = activoService.findById(id);
		
		activoActual.setEfectivo(activos.getEfectivo());
		activoActual.setDepositos_financieros(activos.getDepositos_financieros());
		activoActual.setCuentas_cobrar(activos.getCuentas_cobrar());
		activoActual.setInventario_mercaderia(activos.getInventario_mercaderia());
		activoActual.setInversion_cultivos(activos.getInversion_cultivos());
		activoActual.setInversion_ganado(activos.getInversion_ganado());
		activoActual.setMuebles(activos.getMuebles());
		activoActual.setHerramientas_maquinaria(activos.getHerramientas_maquinaria());
		activoActual.setVehiculos(activos.getVehiculos());
		activoActual.setBienes_inmuebles(activos.getBienes_inmuebles());

		
		
		return activoService.save(activoActual);
		
	}
	
	@DeleteMapping("/activos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		activoService.delete(id);
	}
	
	
}
