package com.example.demo.service;

import com.example.demo.model.Funcionario;

import java.util.List;
import java.util.Optional;

public interface FuncionarioService {

    public Funcionario save(Funcionario funcionario);
    public List<Funcionario> getAll();

    Optional<Funcionario> findById(String id);

    void delete(String id);

    Funcionario update(Funcionario funcionario);
}