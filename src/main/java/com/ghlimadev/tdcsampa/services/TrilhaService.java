package com.ghlimadev.tdcsampa.services;

import java.util.List;

import javax.transaction.Transactional;

import com.ghlimadev.tdcsampa.entities.Trilha;

import com.ghlimadev.tdcsampa.repositories.TrilhaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrilhaService {

  @Autowired
  private TrilhaRepository trilhaRepository;

  public Trilha findById(Long id) {
    return trilhaRepository.findById(id).orElse(null);
  }

  public List<Trilha> findAll() {
    return trilhaRepository.findAll();
  }

  @Transactional
  public Trilha save(Trilha espec) {
    return trilhaRepository.save(espec);
  }

  @Transactional
  public boolean deleteById(Long id) {
    if (trilhaRepository.findById(id).isPresent()) {
      trilhaRepository.deleteById(id);
      return true;
    }
    return false;
  }

}