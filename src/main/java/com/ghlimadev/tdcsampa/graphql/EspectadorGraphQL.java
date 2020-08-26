package com.ghlimadev.tdcsampa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.ghlimadev.tdcsampa.entities.Espectador;
import com.ghlimadev.tdcsampa.models.EspectadorInput;
import com.ghlimadev.tdcsampa.services.EspectadorService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EspectadorGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private EspectadorService espectadorService;

  public Espectador espectador(Long id) {
    return espectadorService.findById(id);
  }

  public List<Espectador> espectadores() {
    return espectadorService.findAll();
  }

  public Espectador salvaEspectador(EspectadorInput espec) {
    ModelMapper model = new ModelMapper();
    Espectador espectador = model.map(espec, Espectador.class);
    return espectadorService.save(espectador);
  }

  public boolean deletarEspectador(Long id) {
    return espectadorService.deleteById(id);
  }

}