package com.example.demo.services;

import com.example.demo.model.Persona;

import java.util.List;

public interface IPersonaService {

    public Persona getPersonaById(Integer id);

    public List<Persona> getPersonas(Integer limit);

    public Persona savePersona(Persona persona);

    public Persona updatePersona(Persona persona);

    public void deletePersona(Persona persona);
}
