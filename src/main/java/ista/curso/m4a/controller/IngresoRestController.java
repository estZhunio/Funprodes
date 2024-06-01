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

import ista.curso.m4a.model.entity.Ingresos;
import ista.curso.m4a.model.services.IIngresosService;

@RestController
@RequestMapping("/api")
public class IngresoRestController {

	@Autowired
	private IIngresosService ingresoService;
	
	@GetMapping("/ingresos")
	public List<Ingresos> index() {
		return ingresoService.findAll();
	}
	
	@GetMapping("/ingresos/{id}")
	public Ingresos show(@PathVariable Long id) {
		return ingresoService.findById(id);
	}
	
	@PostMapping("/ingresos")
	@ResponseStatus(HttpStatus.CREATED)
	public Ingresos create(@RequestBody Ingresos ingreso) {
		return ingresoService.save(ingreso);
	}
	
	@PutMapping("/ingresos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ingresos update(@RequestBody Ingresos ingreso, @PathVariable Long id) {
		Ingresos ingresoActual = ingresoService.findById(id);
		
		ingresoActual.setSueldo(ingreso.getSueldo());
		ingresoActual.setSueldoConyugue(ingreso.getSueldoConyugue());
		ingresoActual.setComercio(ingreso.getComercio());
		ingresoActual.setAgricultura(ingreso.getAgricultura());
		ingresoActual.setGanaderia(ingreso.getGanaderia());
		ingresoActual.setArriendos(ingreso.getArriendos());
		ingresoActual.setAlquilerVehiculos(ingreso.getAlquilerVehiculos());
		ingresoActual.setIntereses(ingreso.getIntereses());
		ingresoActual.setPensiones(ingreso.getPensiones());
		ingresoActual.setOtrosIngresos(ingreso.getOtrosIngresos());

		
		
		return ingresoService.save(ingresoActual);
		
	}
	
	@DeleteMapping("/ingresos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ingresoService.delete(id);
	}
	
	
}
