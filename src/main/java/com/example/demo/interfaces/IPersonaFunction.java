package com.example.demo.interfaces;

import com.example.demo.model.Persona;

public interface IPersonaFunction extends IDateFunction{

    public default Persona getPersona(Integer id, String nombre, String correo, String apPat, String apMat, String fechaNacimiento){
        return Persona.builder().id(id)
                .nombre(nombre).correo(correo).apPat(apPat).apMat(apMat)
                .fechaNacimiento(getLocalDate(fechaNacimiento)).build();
    }
}
