package com.ghlimadev.tdcsampa.repositories;

import com.ghlimadev.tdcsampa.entities.Trilha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TrilhaRepository
 */
@Repository
public interface TrilhaRepository extends JpaRepository<Trilha, Long> {
}