package com.digital.devs.dao;

import com.digital.devs.model.User;
import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;

public interface UserRepository extends DocumentDbRepository<User, String>{

}
