package com.backend.projeto.service;

import com.backend.projeto.model.Telefone;
import com.backend.projeto.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {
    @Autowired
    private TelefoneRepository  telefoneRepository;

    public List<Telefone> findAll(){
        return this.telefoneRepository.findAll();
    }

    public Telefone save(Telefone telefone){
        return this.telefoneRepository.save(telefone);
    }


}
