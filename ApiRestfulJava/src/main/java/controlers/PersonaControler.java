package com.example.ApiRestfulJava.controlers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiRestfulJava.models.PersonaModel;
import com.example.ApiRestfulJava.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaControler {

    @Autowired
    PersonaService personaService;

    @GetMapping()
    public ArrayList<PersonaModel> obtenerPersonas() {
        return personaService.obtenerPersonas();
    }

    @PostMapping()
    public PersonaModel guardarPersona(@RequestBody PersonaModel persona) {
        return this.personaService.guardarPersona(persona);
    }

    @GetMapping(path = "/{id}")
    public Optional<PersonaModel> obtenerPersonaPorId(@PathVariable("id") Long id) {
        return this.personaService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.personaService.eliminarPersona(id);
        if (ok) {
            return "Se eliminó el persona con id " + id;
        } else {
            return "No pudo eliminar el persona con id" + id;
        }
    }

}
