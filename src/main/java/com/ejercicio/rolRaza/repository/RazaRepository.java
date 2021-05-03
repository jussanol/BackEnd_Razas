package com.ejercicio.rolRaza.repository;

import com.ejercicio.rolRaza.model.Raza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RazaRepository extends JpaRepository<Raza, Long> {
}
