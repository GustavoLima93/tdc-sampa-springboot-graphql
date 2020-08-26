package com.ghlimadev.tdcsampa.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ghlimadev.tdcsampa.entities.Compra;
import com.ghlimadev.tdcsampa.entities.Espectador;
import com.ghlimadev.tdcsampa.entities.Trilha;

import com.ghlimadev.tdcsampa.services.EspectadorService;
import com.ghlimadev.tdcsampa.services.TrilhaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompraResolver implements GraphQLResolver<Compra> {
  @Autowired
  private TrilhaService trilhaService;

  @Autowired
  private EspectadorService espectadorService;

  public Espectador espectador(Compra c) {
    return espectadorService.findById(c.getId());
  }

  public Trilha trilha(Compra c) {
    return trilhaService.findById(c.getId());
  }

}