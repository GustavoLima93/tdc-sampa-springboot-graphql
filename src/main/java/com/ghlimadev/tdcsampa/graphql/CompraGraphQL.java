package com.ghlimadev.tdcsampa.graphql;

import java.util.Date;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.ghlimadev.tdcsampa.entities.Compra;
import com.ghlimadev.tdcsampa.models.CompraInput;
import com.ghlimadev.tdcsampa.services.CompraService;

import com.ghlimadev.tdcsampa.services.EspectadorService;

import com.ghlimadev.tdcsampa.services.TrilhaService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Component;

@Component
public class CompraGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private CompraService compraService;

  @Autowired
  private EspectadorService espectadorService;

  @Autowired
  private TrilhaService trilhaService;

  public Compra compra(Long id) {
    return compraService.findById(id);
  }

  public List<Compra> compras(int page, int size) {
    Pageable pageable = PageRequest.of(page, size);
    return compraService.findAll(pageable);
  }

  public Compra salvarCompra(CompraInput cpr) {
    ModelMapper model = new ModelMapper();
    Compra compra = model.map(cpr, Compra.class);
    compra.setEspectador(espectadorService.findById(cpr.getEspectadorId()));
    compra.setTrilha(trilhaService.findById(cpr.getTrilhaId()));
    compra.setData(new Date());
    return compraService.save(compra);
  }

  public boolean deletarCompra(Long id) {
    return compraService.deleteById(id);
  }

}