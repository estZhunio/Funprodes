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

import ista.curso.m4a.model.entity.Vehiculo;
import ista.curso.m4a.model.services.IVehiculoService;

@RestController
@RequestMapping("/api")
public class VehiculoRestController {

	@Autowired
	private IVehiculoService vehiculoService;
	
	//listar
	@GetMapping("/vehiculo")
	public List<Vehiculo> index(){
		return vehiculoService.findAll();
	}
	
	//buscar por id
	@GetMapping("/vehiculo/{id}")
	public Vehiculo show(@PathVariable Long id) {
		return vehiculoService.findById(id);
	}
	
	//guardar
	@PostMapping("/vehiculo")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehiculo create(@RequestBody Vehiculo vehiculo) {
		return vehiculoService.save(vehiculo);
	}
	
	//modi
	@PutMapping("/vehiculo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehiculo update(@RequestBody Vehiculo vehiculo,@PathVariable Long id) {
		Vehiculo vehiculoActual=vehiculoService.findById(id);
		
		vehiculoActual.setTipoVehiculo(vehiculo.getTipoVehiculo());
		vehiculoActual.setMarca(vehiculo.getMarca());
		vehiculoActual.setValor(vehiculo.getValor());
		vehiculoActual.setAnioFabricacion(vehiculo.getAnioFabricacion());
		
		
		return vehiculoService.save(vehiculoActual);
	}
	//eliminar
	@DeleteMapping("/vehiculo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		vehiculoService.delete(id);
	}
}
