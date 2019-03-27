package com.backend.projeto.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TelefoneTest {

    private  Telefone telefone;

    @Test
    public void telefoneTest() {
        telefone = new Telefone();
        telefone.setId(1);
        telefone.setNumero("61-9.8888-7777");
        telefone.setTipo("Telefone");
        telefone.setCliente(new Cliente());

        assertTrue(telefone.getId().equals(1));
        assertTrue(telefone.getNumero().equals("61-9.8888-7777"));
        assertTrue(telefone.getTipo().equals("Telefone"));
        assertNotNull(telefone.getCliente());
    }
}