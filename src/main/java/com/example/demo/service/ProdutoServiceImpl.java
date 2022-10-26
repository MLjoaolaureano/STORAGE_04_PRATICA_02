package com.example.demo.service;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> getAll() {
        List<Produto> produtoList = new ArrayList();
        produtoRepository.findAll().forEach(produtoList::add);
        return produtoList;
    }

    @Override
    public Optional<Produto> findById(String id) {
        return produtoRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public Produto update(Produto produto) {
        return produtoRepository.save(produto);
    }


}