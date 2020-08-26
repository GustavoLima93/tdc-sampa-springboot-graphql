package com.ghlimadev.tdcsampa.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Compra {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Date data;
  private Integer quantidade;
  private String status;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "espectador_id", nullable = true)
  private Espectador espectador;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "trilha_id", nullable = true)
  private Trilha trilha;

}