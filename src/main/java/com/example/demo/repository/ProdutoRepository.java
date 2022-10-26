package com.example.demo.repository;

import com.example.demo.model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends ElasticsearchRepository<Produto, String> {


}

