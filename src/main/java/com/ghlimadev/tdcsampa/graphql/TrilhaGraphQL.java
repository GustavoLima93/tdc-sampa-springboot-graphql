package com.ghlimadev.tdcsampa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.ghlimadev.tdcsampa.entities.Trilha;
import com.ghlimadev.tdcsampa.models.TrilhaInput;
import com.ghlimadev.tdcsampa.services.TrilhaService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrilhaGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private TrilhaService trilhaService;

  public Trilha trilha(Long id) {
    return trilhaService.findById(id);
  }

  public List<Trilha> trilhas() {
    return trilhaService.findAll();
  }

  public Trilha salvarTrilha(TrilhaInput trl) {
    ModelMapper model = new ModelMapper();
    Trilha trilha = model.map(trl, Trilha.class);
    return trilhaService.save(trilha);
  }

  public boolean deletarTrilha(Long id) {
    return trilhaService.deleteById(id);
  }

}