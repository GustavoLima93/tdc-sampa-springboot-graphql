package com.ghlimadev.tdcsampa.repositories;

import com.ghlimadev.tdcsampa.entities.Espectador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EspectadorRepository
 */
@Repository
public interface EspectadorRepository extends JpaRepository<Espectador, Long> {
}