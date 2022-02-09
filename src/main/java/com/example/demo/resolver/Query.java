package com.example.demo.resolver;

import com.example.demo.model.Persona;
import com.example.demo.services.IPersonaService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    IPersonaService personaService;

    public Persona getPersona(Integer id){
        log.info("Retrieving persona by id: {}", id);
        return this.personaService.getPersonaById(id);
    }

    public List<Persona> getPersonas(Integer limit){
        log.info("Reatriving all personas with pagination {}", limit);
        return this.personaService.getPersonas(limit);
    }
}
