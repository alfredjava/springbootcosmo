package com.digital.devs.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.devs.model.Enfermedad;
import com.digital.devs.model.Recordatorio;
import com.digital.devs.service.IEnfermedadService;



@RestController
@RequestMapping(value = "/enfermedades")
public class EnfermedadController {

	@Autowired
	private IEnfermedadService service;
	
	@GetMapping
	public List<Enfermedad> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}")
	public Enfermedad listarPorId(@PathVariable("id") String id){
		Optional<Enfermedad> op = service.listarPorId(id);
		return op.isPresent() ? op.get() : new Enfermedad();
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Enfermedad registrar(@RequestBody Enfermedad persona) {
		return service.registrar(persona);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Enfermedad modificar(@RequestBody Enfermedad persona) {
		return service.modificar(persona);
	}

	@DeleteMapping(value = "/{id}")
	public Integer eliminar(@PathVariable("id") String id) {
		Optional<Enfermedad> opt = service.listarPorId(id);
		if (opt.isPresent()) {
			Enfermedad per = new Enfermedad();
			per.setId(id);
			service.eliminar(per);
			return 1;
		}
		return 0;
	}
	
	
}
