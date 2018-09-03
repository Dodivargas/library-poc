package br.com.dodivargas.livroservice.api;

import br.com.dodivargas.livroservice.input.LivroInput;
import br.com.dodivargas.livroservice.mapper.LivroMapper;
import br.com.dodivargas.livroservice.output.mapper.LivroOutputMapper;
import br.com.dodivargas.livroservice.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/livros")
public class LivroApi {

    private LivroService livroService;

    @Autowired
    public LivroApi(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getLivro(@PathVariable String id) {
        return ok(LivroOutputMapper.map(livroService.get(id)));
    }

    @GetMapping
    public ResponseEntity<?> getLivros() {
        return ok(livroService.getLivros().stream().map(LivroOutputMapper::map).collect(Collectors.toList()));
    }

    @PostMapping
    public void insert(@RequestBody LivroInput livroInput) {
        livroService.insert(LivroMapper.map(livroInput));
    }

    @DeleteMapping
    public void delete(@RequestBody LivroInput livroInput) {
        livroService.delete(LivroMapper.map(livroInput));
    }

}
