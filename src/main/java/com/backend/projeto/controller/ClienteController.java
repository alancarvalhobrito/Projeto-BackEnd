package com.backend.projeto.controller;

import com.backend.projeto.model.Cliente;
import com.backend.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Cliente> clientes = clienteService.findAll();
        if (!clientes.isEmpty()) return ResponseEntity.ok(clientes);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Cliente cliente = clienteService.findById(id);
        if (cliente != null) return ResponseEntity.ok(cliente);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Cliente cliente){
        Cliente clienteSalvo = clienteService.save(cliente);
        if (clienteSalvo != null) return new ResponseEntity<>(clienteSalvo, HttpStatus.CREATED);
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Cliente cliente){
        Cliente clienteSalvo = clienteService.update(id, cliente);
        if (clienteSalvo != null) return ResponseEntity.ok(clienteSalvo);
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        Boolean deletado = clienteService.delete(id);
        if (deletado == true) return ResponseEntity.ok("DELETED SUCCESSFULLY!");
        return ResponseEntity.noContent().build();
    }

}
