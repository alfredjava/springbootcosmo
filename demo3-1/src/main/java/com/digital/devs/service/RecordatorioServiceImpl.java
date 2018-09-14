package com.digital.devs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.devs.dao.IRecordatorioDAO;
import com.digital.devs.model.Recordatorio;

@Service
public class RecordatorioServiceImpl implements IRecordatorioService {

	@Autowired
	private IRecordatorioDAO dao;

	@Override
	public List<Recordatorio> listar() {
		return (List<Recordatorio>) dao.findAll();
	}

	@Override
	public Optional<Recordatorio> listarPorId(String id) {		
		return dao.findById(id);
	}

	@Override
	public Recordatorio registrar(Recordatorio per) {
		return dao.save(per);
	}

	@Override
	public Recordatorio modificar(Recordatorio per) {
		Optional<Recordatorio> persona = dao.findById(per.getId());
		
		if (persona.isPresent()) {
			return dao.save(per);
		}
		return new Recordatorio();
	}

	@Override
	public void eliminar(Recordatorio per) {
		dao.delete(per);
	}
}
