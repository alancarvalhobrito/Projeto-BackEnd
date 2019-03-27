package com.backend.projeto.service;

import com.backend.projeto.model.Cliente;
import com.backend.projeto.model.Telefone;
import com.backend.projeto.repository.ClienteRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class ClienteServiceTest {

    @InjectMocks
    private ClienteService clienteService;

    @Mock
    private  TelefoneService telefoneService;

    @Mock
    private ClienteRepository clienteRepository;

    @Mock
    private Cliente cliente;

    @Test
    public void findAllTest() {
        given(clienteRepository.findAll()).willReturn(Arrays.asList(cliente));
        assertTrue(!clienteService.findAll().isEmpty());
    }

    @Test
    public void findByIdTest() {
        Optional<Cliente> clienteOptional = Optional.of(cliente);
        given(clienteRepository.findById(anyInt())).willReturn(clienteOptional);
        assertNotNull(clienteService.findById(1));

    }

    @Test
    public void saveTest() {
        given(clienteRepository.save(any(Cliente.class))).willReturn(cliente);
        given(cliente.getTelefones()).willReturn(Arrays.asList(new Telefone()));
        assertNotNull(clienteService.save(cliente));
    }

    @Test
    public void updateTest() {
        Optional<Cliente> clienteOptional = Optional.of(cliente);
        given(clienteRepository.findById(anyInt())).willReturn(clienteOptional);
        given(cliente.getTelefones()).willReturn(Arrays.asList(new Telefone()));
        assertNotNull(clienteService.update(1, cliente));

    }

    @Test
    public void deleteTest() {
        Optional<Cliente> clienteOptional = Optional.of(cliente);
        given(clienteRepository.findById(anyInt())).willReturn(clienteOptional);
        assertTrue(clienteService.delete(1));
    }

}