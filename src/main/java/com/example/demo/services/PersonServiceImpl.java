package com.example.demo.services;

import com.example.demo.model.Persona;
import com.example.demo.repository.IPersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PersonServiceImpl implements IPersonaService{

    @Autowired
    IPersonaRepository personaRepository;

    @Override
    public Persona getPersonaById(Integer id) {
        log.info("getPersonaById({})", id);
        return this.personaRepository.findById(id).get();
    }

    @Override
    public List<Persona> getPersonas(Integer limit) {
        log.info("getPersonas()");
        Pageable pageLimit = PageRequest.of(0,limit);
        return this.personaRepository.findAll(pageLimit).getContent();
    }

    @Override
    public Persona savePersona(Persona persona) {
        log.info("savePersona({})", persona);
        return this.personaRepository.save(persona);
    }

    @Override
    public Persona updatePersona(Persona persona) {
        log.info("updatePersona({})", persona);
        return this.savePersona(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        log.info("deletePersona({})", persona);
        this.personaRepository.delete(persona);
    }
}
