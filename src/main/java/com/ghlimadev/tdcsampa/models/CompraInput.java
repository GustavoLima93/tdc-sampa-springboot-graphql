package com.ghlimadev.tdcsampa.models;

import lombok.Data;

@Data
public class CompraInput {

  private Long id;
  private Integer quantidade;
  private String status;

  private Long espectadorId;
  private Long trilhaId;

}