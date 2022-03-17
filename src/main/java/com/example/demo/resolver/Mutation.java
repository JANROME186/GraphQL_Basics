package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.interfaces.IBuilderFunction;
import com.example.demo.model.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Mutation implements GraphQLMutationResolver, IBuilderFunction {

    public Persona savePersona(String nombre, String correo, String apPat, String apMat, String fechaNacimiento){

        return null;
    }

    public Persona updatePersona(Integer id, String nombre, String correo, String apPat, String apMat, String fechaNacimiento){
        return null;
    }

    public Persona deletePersona(Integer id, String nombre, String correo, String apPat, String apMat, String fechaNacimiento){
       return null;
    }
}
