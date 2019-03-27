package com.backend.projeto.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EnderecoTest {

    private Endereco endereco;

    @Test
    public void enderecoTest() {
        endereco =  new Endereco();
        endereco.setId(1);
        endereco.setCep("71010-077");
        endereco.setLogradouro("QI 99 Bloco G");
        endereco.setBairro("Guará I");
        endereco.setCidade("Brasília");
        endereco.setUf("DF");
        endereco.setComplemento("Apt");

        assertTrue(endereco.getId().equals(1));
        assertTrue(endereco.getCep().equals("71010-077"));
        assertTrue(endereco.getLogradouro().equals("QI 99 Bloco G"));
        assertTrue(endereco.getBairro().equals("Guará I"));
        assertTrue(endereco.getCidade().equals("Brasília"));
        assertTrue(endereco.getUf().equals("DF"));
        assertTrue(endereco.getComplemento().equals("Apt"));


    }
}