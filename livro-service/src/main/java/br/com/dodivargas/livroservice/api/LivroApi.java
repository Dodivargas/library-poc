package br.com.dodivargas.livroservice.api;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroApi {

    private LivroService livroService;

    @Autowired
    public LivroApi(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping(value = "/{id}")
    public Livro getLivro(@PathVariable Integer id) {
        Livro livro = new Livro();
        livro.setGenero("Daleo");
        return livro;
    }

}
