package com.pragma.testpragma.repository;

import com.pragma.testpragma.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long > {
}
