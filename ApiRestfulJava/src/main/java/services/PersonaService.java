package com.example.ApiRestfulJava.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiRestfulJava.models.PersonaModel;
import com.example.ApiRestfulJava.repositories.PersonaRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    PersonaRepositorie personaRepositorie;

    public ArrayList<PersonaModel> obtenerPersonas() {
        return (ArrayList<PersonaModel>) personaRepositorie.findAll();
    }

    public PersonaModel guardarPersona(PersonaModel persona) {
        return personaRepositorie.save(persona);
    }

    public Optional<PersonaModel> obtenerPorId(Long id) {
        return personaRepositorie.findById(id);
    }

    public boolean eliminarPersona(Long id) {
        try {
            personaRepositorie.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
