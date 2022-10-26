package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "produtos")
@TypeAlias("produto")
public class Produto {
    @Id
    private String id;

    private String nome;


    private String categoria;

    private double precoVenda;

    private int quantidadeDisponivel;

    private String localizacaoArmazem;

}