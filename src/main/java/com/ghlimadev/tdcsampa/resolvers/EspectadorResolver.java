package com.ghlimadev.tdcsampa.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ghlimadev.tdcsampa.entities.Compra;
import com.ghlimadev.tdcsampa.entities.Espectador;
import com.ghlimadev.tdcsampa.services.CompraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EspectadorResolver implements GraphQLResolver<Espectador> {

  @Autowired
  private CompraService compraService;

  public List<Compra> compras(Espectador espec) {
    return compraService.findaAllByEspectador(espec);
  }

}