package com.backend.projeto.model;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ClienteTest {

    private Cliente cliente;

    @Test
    public void clienteTest() {
        cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Jão da Silva");
        cliente.setCpf("012345678-90");
        cliente.setEndereco(new Endereco());
        cliente.setTelefones(Arrays.asList(new Telefone()));

        assertTrue(cliente.getId().equals(1));
        assertTrue(cliente.getNome().equals("Jão da Silva"));
        assertTrue(cliente.getCpf().equals("012345678-90"));
        assertNotNull(cliente.getEndereco());
        assertTrue(!cliente.getTelefones().isEmpty());
    }
}