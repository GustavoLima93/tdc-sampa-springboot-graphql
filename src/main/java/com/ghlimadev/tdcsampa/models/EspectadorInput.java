package com.ghlimadev.tdcsampa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EspectadorInput {

  public Long id;
  public String nome;
  public String email;
}