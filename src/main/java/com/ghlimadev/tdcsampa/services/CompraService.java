package com.ghlimadev.tdcsampa.services;

import java.util.List;

import javax.transaction.Transactional;

import com.ghlimadev.tdcsampa.entities.Compra;
import com.ghlimadev.tdcsampa.entities.Espectador;
import com.ghlimadev.tdcsampa.repositories.CompraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

  @Autowired
  private CompraRepository compraRepository;

  public Compra findById(Long id) {
    return compraRepository.findById(id).orElse(null);
  }

  public List<Compra> findAll(Pageable pageable) {
    return compraRepository.findAll(pageable).getContent();
  }

  @Transactional
  public Compra save(Compra compra) {
    return compraRepository.save(compra);
  }

  @Transactional
  public boolean deleteById(Long id) {
    if (compraRepository.findById(id).isPresent()) {
      compraRepository.deleteById(id);
      return true;
    }
    return false;
  }

  public List<Compra> findaAllByEspectador(Espectador espec) {
    return compraRepository.findAllByEspectador(espec);
  }

}