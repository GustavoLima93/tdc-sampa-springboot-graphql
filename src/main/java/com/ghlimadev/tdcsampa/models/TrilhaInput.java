package com.ghlimadev.tdcsampa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TrilhaInput {

  private Long id;
  private String nome;
  private double valor;

}