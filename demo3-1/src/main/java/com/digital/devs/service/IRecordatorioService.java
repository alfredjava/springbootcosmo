package com.digital.devs.service;

import java.util.List;
import java.util.Optional;

import com.digital.devs.model.Recordatorio;

public interface IRecordatorioService {
	
	List<Recordatorio> listar();
	Optional<Recordatorio> listarPorId(String id);	
	Recordatorio registrar(Recordatorio per);
	Recordatorio modificar(Recordatorio per);
	void eliminar(Recordatorio per);

}
