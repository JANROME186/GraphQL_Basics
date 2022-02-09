package com.example.demo.resolver;

import com.example.demo.interfaces.IPersonaFunction;
import com.example.demo.model.Persona;
import com.example.demo.services.IPersonaService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Slf4j
@Component
public class Mutation implements GraphQLMutationResolver, IPersonaFunction {
    @Autowired
    IPersonaService personaService;

    public Persona savePersona(String nombre, String correo, String apPat, String apMat, String fechaNacimiento){

        return this.personaService.savePersona(
                this.getPersona(null,nombre,correo, apPat,apMat,fechaNacimiento));
    }

    public Persona updatePersona(Integer id, String nombre, String correo, String apPat, String apMat, String fechaNacimiento){

        return this.personaService.savePersona(
                this.getPersona(id,nombre,correo, apPat,apMat,fechaNacimiento));
    }

    public Persona deletePersona(Integer id, String nombre, String correo, String apPat, String apMat, String fechaNacimiento){
        Persona persona = this.getPersona(id,nombre,correo, apPat,apMat,fechaNacimiento);
        this.personaService.deletePersona(persona);
        return persona;
    }
}
