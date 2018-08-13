package br.com.dodivargas.livroservice.service;

import br.com.dodivargas.livroservice.dto.Livro;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    public Livro getLivro(Integer id) {

        return new Livro();
    }

}
