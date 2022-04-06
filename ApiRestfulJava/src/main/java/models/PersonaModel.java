package com.example.ApiRestfulJava.models;

import javax.persistence.*;

@Entity
@Table(name = "persona")

public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String nombrecompleto;
    private String fechadenacimiento;
    private String adopt;

    public PersonaModel(Long id, String nombrecompleto, String fechadenacimiento, String adopt) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.fechadenacimiento = fechadenacimiento;
        this.adopt = adopt;
    }

    public Long getId() {
        return id;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public String getAdopt() {
        return adopt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setAdopt(String adopt) {
        this.adopt = adopt;
    }

}
