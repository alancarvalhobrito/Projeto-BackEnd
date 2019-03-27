package com.backend.projeto.service;

import com.backend.projeto.model.Endereco;
import com.backend.projeto.repository.EnderecoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class EnderecoServiceTest {

    @InjectMocks
    private EnderecoService enderecoService;

    @Mock
    private EnderecoRepository enderecoRepository;

    @Test
    public void findAllTest() {
        given(enderecoRepository.findAll()).willReturn(Arrays.asList(new Endereco()));
        assertTrue(!enderecoService.findAll().isEmpty());
    }
}