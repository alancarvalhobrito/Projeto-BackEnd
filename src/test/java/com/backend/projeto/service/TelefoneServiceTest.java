package com.backend.projeto.service;

import com.backend.projeto.model.Telefone;
import com.backend.projeto.repository.TelefoneRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class TelefoneServiceTest {

    @InjectMocks
    private TelefoneService telefoneService;

    @Mock
    private TelefoneRepository telefoneRepository;

    @Test
    public void findAllTest() {
        given(telefoneRepository.findAll()).willReturn(Arrays.asList(new Telefone()));
        assertTrue(!telefoneService.findAll().isEmpty());
    }
    @Test
    public void saveTest() {
        given(telefoneRepository.save(any(Telefone.class))).willReturn(new Telefone());
        assertNotNull(telefoneService.save(new Telefone()));
    }
}