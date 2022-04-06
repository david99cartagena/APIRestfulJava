package com.example.ApiRestfulJava.repositories;

import com.example.ApiRestfulJava.models.PersonaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorie extends CrudRepository<PersonaModel, Long> {

}
