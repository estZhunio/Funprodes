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

import ista.curso.m4a.model.entity.Gastos;
import ista.curso.m4a.model.services.IGastosService;

@RestController
@RequestMapping("/api")
public class GastoRestController {

	@Autowired
	private IGastosService gastoService;
	
	@GetMapping("/gastos")
	public List<Gastos> index() {
		return gastoService.findAll();
	}
	
	@GetMapping("/gastos/{id}")
	public Gastos show(@PathVariable Long id) {
		return gastoService.findById(id);
	}
	
	@PostMapping("/gastos")
	@ResponseStatus(HttpStatus.CREATED)
	public Gastos create(@RequestBody Gastos gasto) {
		return gastoService.save(gasto);
	}
	
	@PutMapping("/gastos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Gastos update(@RequestBody Gastos gasto, @PathVariable Long id) {
		Gastos gastoActual = gastoService.findById(id);
		
		gastoActual.setAlimentacion(gasto.getAlimentacion());
		gastoActual.setArriendo(gasto.getArriendo());
		gastoActual.setServiciosBasico(gasto.getServiciosBasico());
		gastoActual.setEducacion(gasto.getSalud());
		gastoActual.setSalud(gasto.getSalud());
		gastoActual.setDeudas(gasto.getDeudas());
		gastoActual.setVestimenta(gasto.getVestimenta());
		gastoActual.setPensiones(gasto.getPensiones());
		gastoActual.setTransporte(gasto.getTransporte());
		gastoActual.setOtrosEgresos(gasto.getOtrosEgresos());
		gastoActual.setTotalGastos(gasto.getTotalGastos());

		return gastoService.save(gastoActual);
		
	}
	
	@DeleteMapping("/gastos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		gastoService.delete(id);
	}
	
	
}
