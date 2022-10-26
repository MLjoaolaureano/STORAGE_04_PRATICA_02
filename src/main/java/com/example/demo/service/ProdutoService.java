package com.example.demo.service;

import com.example.demo.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    public Produto save(Produto produto);

    public List<Produto> getAll();

    Optional<Produto> findById(String id);

    void delete(String id);

    Produto update(Produto produto);
}