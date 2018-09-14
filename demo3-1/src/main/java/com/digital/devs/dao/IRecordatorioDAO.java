package com.digital.devs.dao;

import com.digital.devs.model.Recordatorio;
import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;

public interface IRecordatorioDAO extends DocumentDbRepository<Recordatorio, String>{

}
