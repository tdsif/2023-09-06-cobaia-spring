package br.edu.ifrs.riogrande.tads.cobaia.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Aluno {

  private Integer matricula;
  
  @JsonProperty("nomeCompleto")
  private String nome;

  @JsonIgnore // não vai para o payload ("não vira json")
  private String cpf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Integer getMatricula() {
    return matricula;
  }

  public void setMatricula(Integer matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Builder "preguiçoso"
  public Aluno withMatricula(Integer matricula) {
    this.setMatricula(matricula);
    return this;
  }

  public Aluno withNome(String nome) {
    this.setNome(nome);
    return this;
  }
  
}
