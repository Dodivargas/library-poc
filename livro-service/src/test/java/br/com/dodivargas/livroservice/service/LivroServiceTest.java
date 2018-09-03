package br.com.dodivargas.livroservice.service;

import br.com.dodivargas.livroservice.repository.LivroRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class LivroServiceTest {

    private LivroService livroService;
    private LivroRepository livroRepository;


    @Before
    public void setUp() {
        livroRepository = Mockito.mock(LivroRepository.class);
        livroService = new LivroService(livroRepository);
    }

    @Test
    public void get() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void getLivros() {
    }

    @Test
    public void delete() {
    }
}
