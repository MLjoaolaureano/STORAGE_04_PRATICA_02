package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "empleados")
@TypeAlias("empleado")
public class Funcionario {
    @Id
    private String id;

    private String nome;


    private String idade;

    private String cidade;

}