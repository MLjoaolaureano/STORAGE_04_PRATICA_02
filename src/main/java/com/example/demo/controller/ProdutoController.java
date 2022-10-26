package com.example.demo.controller;

import com.example.demo.model.Funcionario;
import com.example.demo.model.Produto;
import com.example.demo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto save(@RequestBody Produto produto) {
        return produtoService.save(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAll() {
        List<Produto> produtos = produtoService.getAll();

        return new ResponseEntity<>(produtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable String id) {
        Optional<Produto> produto = produtoService.findById(id);

        if (produto.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(produto.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        produtoService.delete(id);
        return new ResponseEntity<>("Artigo removido", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Produto> update(@RequestBody Produto produto) {
        Produto produtoUpdated = produtoService.update(produto);

        return new ResponseEntity<>(produtoUpdated, HttpStatus.OK);
    }
}