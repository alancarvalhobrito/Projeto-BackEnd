package com.backend.projeto.controller;

import com.backend.projeto.model.Telefone;
import com.backend.projeto.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/telefones")
public class TelefoneController {

    @Autowired
    private TelefoneService telefoneService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Telefone> telefones = telefoneService.findAll();
        if (!telefones.isEmpty()) return ResponseEntity.ok(telefones);
        return ResponseEntity.noContent().build();
    }

}
