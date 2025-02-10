package com.pragma.testpragma.controller;

import com.pragma.testpragma.model.Persona;
import com.pragma.testpragma.service.IpersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {


    private final IpersonaService ipersonaService;

    public PersonaController(IpersonaService ipersonaService) {
        this.ipersonaService = ipersonaService;
    }

    @GetMapping("/consultar/{id}")
    public Persona consultarPersona(@PathVariable Long id){
        return ipersonaService.consultarPersona(id);
    }

    @PostMapping("/guardar")
    public Persona guardarPersona(@RequestBody Persona persona) {
        return ipersonaService.guardarPersona(persona);
    }



}
