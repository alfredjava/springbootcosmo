package com.digital.devs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.devs.dao.IEnfermedadDAO;
import com.digital.devs.model.Enfermedad;

@Service
public class EnfermedadServiceImpl implements IEnfermedadService {

	@Autowired
	private IEnfermedadDAO dao;

	@Override
	public List<Enfermedad> listar() {
		return (List<Enfermedad>) dao.findAll();
	}

	@Override
	public Optional<Enfermedad> listarPorId(String id) {		
		return dao.findById(id);
	}

	@Override
	public Enfermedad registrar(Enfermedad per) {
		return dao.save(per);
	}

	@Override
	public Enfermedad modificar(Enfermedad per) {
		Optional<Enfermedad> persona = dao.findById(per.getId());
		
		if (persona.isPresent()) {
			return dao.save(per);
		}
		return new Enfermedad();
	}

	@Override
	public void eliminar(Enfermedad per) {
		dao.delete(per);
	}
}
