package com.backend.projeto.service;

import com.backend.projeto.model.Endereco;
import com.backend.projeto.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> findAll(){
        return this.enderecoRepository.findAll();
    }

}
