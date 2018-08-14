package br.com.dodivargas.livroservice.api;

import br.com.dodivargas.livroservice.output.LivroOutput;
import br.com.dodivargas.livroservice.output.mapper.LivroOutputMapper;
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
    public LivroOutput getLivro(@PathVariable String id) {
        return LivroOutputMapper.map(livroService.getLivro(id));
    }
}
