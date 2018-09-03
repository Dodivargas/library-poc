package br.com.dodivargas.livroservice.service;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.entity.mapper.LivroEntityMapper;
import br.com.dodivargas.livroservice.mapper.LivroMapper;
import br.com.dodivargas.livroservice.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro get(String id) {
        return LivroMapper.map(livroRepository.findById(id));
    }

    public void insert(Livro livro) {
        livroRepository.insert(LivroEntityMapper.map(livro));
    }

    public List<Livro> getLivros() {
        return livroRepository.find().stream().map(LivroMapper::map).collect(Collectors.toList());
    }

    public void delete(Livro livro){
        livroRepository.delete(LivroEntityMapper.map(livro));
    }
}
