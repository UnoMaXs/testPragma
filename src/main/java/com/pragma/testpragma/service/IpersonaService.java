package com.pragma.testpragma.service;

import com.pragma.testpragma.model.Persona;

public interface IpersonaService {

    Persona consultarPersona(Long id);
    Persona guardarPersona(Persona persona);

}
