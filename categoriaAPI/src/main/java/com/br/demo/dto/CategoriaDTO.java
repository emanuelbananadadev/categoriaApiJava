package com.br.demo.dto;

public class CategoriaDTO {
    private String nome;

    public CategoriaDTO(String nome) {
        this.nome = nome;
    }

    public CategoriaDTO() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
