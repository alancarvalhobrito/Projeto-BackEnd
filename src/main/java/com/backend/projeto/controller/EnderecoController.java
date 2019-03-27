package com.backend.projeto.controller;

import com.backend.projeto.model.Endereco;
import com.backend.projeto.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Endereco> enderecos = enderecoService.findAll();
        if (!enderecos.isEmpty()) return ResponseEntity.ok(enderecos);
        return ResponseEntity.noContent().build();
    }

}
