package com.plexus.hola.pablo.repository;

import com.plexus.hola.pablo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}