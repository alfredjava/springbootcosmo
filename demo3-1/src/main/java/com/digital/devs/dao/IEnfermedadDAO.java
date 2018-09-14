package com.digital.devs.dao;

import com.digital.devs.model.Enfermedad;
import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;

public interface IEnfermedadDAO extends DocumentDbRepository<Enfermedad, String>{

}
