package com.ghlimadev.tdcsampa.repositories;

import java.util.List;

import com.ghlimadev.tdcsampa.entities.Compra;
import com.ghlimadev.tdcsampa.entities.Espectador;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CompraRepository
 */
@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

  List<Compra> findAllByEspectador(Espectador e);

  Page<Compra> findAll(Pageable pageable);
}