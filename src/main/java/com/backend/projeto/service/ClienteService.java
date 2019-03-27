package com.backend.projeto.service;

import com.backend.projeto.model.Cliente;
import com.backend.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private  TelefoneService telefoneService;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return this.clienteRepository.findAll();
    }

    public Cliente findById(Integer id){
        return this.clienteRepository.findById(id).orElse(null);
    }

    @Transactional
    public Cliente save(Cliente cliente){
        this.clienteRepository.save(cliente);
        cliente.getTelefones().forEach( t -> {
            t.setCliente(cliente);
            telefoneService.save(t);
        });
        return cliente;
    }

    @Transactional
    public Cliente update(Integer id, Cliente cliente){
        Cliente clienteEncontrado = findById(id);
        if (clienteEncontrado != null) {
            cliente.getTelefones().forEach( t -> {
                t.setCliente(cliente);
                telefoneService.save(t);
            });
            return save(cliente);
        }
        return null;
    }

    public boolean delete(Integer id){
        Cliente clienteEncontrado = findById(id);
        if (clienteEncontrado != null){
            this.clienteRepository.delete(clienteEncontrado);
            return true;
        }else {
            return false;
        }
    }

}
