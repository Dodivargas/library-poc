package br.com.dodivargas.livroservice.api;

import br.com.dodivargas.livroservice.input.LivroInput;
import br.com.dodivargas.livroservice.mapper.LivroMapper;
import br.com.dodivargas.livroservice.output.LivroOutput;
import br.com.dodivargas.livroservice.output.mapper.LivroOutputMapper;
import br.com.dodivargas.livroservice.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return LivroOutputMapper.map(livroService.get(id));
    }

    @GetMapping
    public List<LivroOutput> getLivros(){
    return null;
    }

    @PostMapping
    public void insertLivro(@RequestBody LivroInput livroInput) {
        livroService.insert(LivroMapper.map(livroInput));
    }

}
