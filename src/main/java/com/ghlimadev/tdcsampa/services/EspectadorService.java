package com.ghlimadev.tdcsampa.services;

import java.util.List;

import javax.transaction.Transactional;

import com.ghlimadev.tdcsampa.entities.Espectador;
import com.ghlimadev.tdcsampa.repositories.EspectadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspectadorService {

  @Autowired
  private EspectadorRepository espectadorRepository;

  public Espectador findById(Long id) {
    return espectadorRepository.findById(id).orElse(null);
  }

  public List<Espectador> findAll() {
    return espectadorRepository.findAll();
  }

  @Transactional
  public Espectador save(Espectador espec) {
    return espectadorRepository.save(espec);
  }

  @Transactional
  public boolean deleteById(Long id) {
    if (espectadorRepository.findById(id).isPresent()) {
      espectadorRepository.deleteById(id);
      return true;
    }
    return false;
  }

}