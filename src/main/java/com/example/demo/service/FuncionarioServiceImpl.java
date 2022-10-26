package com.example.demo.service;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepositoryRepository;

    @Override
    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepositoryRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> getAll() {
        List<Funcionario> funcionarioList = new ArrayList();
        funcionarioRepositoryRepository.findAll().forEach(funcionarioList::add);
        return funcionarioList;
    }

    @Override
    public Optional<Funcionario> findById(String id) {
        return funcionarioRepositoryRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        funcionarioRepositoryRepository.deleteById(id);
    }

    @Override
    public Funcionario update(Funcionario funcionario) {
        return funcionarioRepositoryRepository.save(funcionario);
    }


}