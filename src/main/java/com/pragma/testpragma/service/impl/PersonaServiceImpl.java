package com.pragma.testpragma.service.impl;

import com.pragma.testpragma.model.Persona;
import com.pragma.testpragma.repository.PersonaRepository;
import com.pragma.testpragma.service.IpersonaService;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IpersonaService {

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public Persona consultarPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }
}
