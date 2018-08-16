package br.com.dodivargas.livroservice.service;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.entity.LivroEntity;
import br.com.dodivargas.livroservice.entity.mapper.LivroEntityMapper;
import br.com.dodivargas.livroservice.mapper.LivroMapper;
import br.com.dodivargas.livroservice.repository.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class LivroService {

    private MongoRepository mongoRepository;

    @Autowired
    public LivroService(MongoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    public Livro get(String id) {
        return LivroMapper.map(mongoRepository.findById(id));
    }

    public void insert(Livro livro) {
        mongoRepository.insert(LivroEntityMapper.map(livro));
    }

    public List<Livro> getLivros() {
        return mongoRepository.find().stream().map(LivroMapper::map).collect(Collectors.toList());
    }

    public void delete(Livro livro){
        mongoRepository.delete(LivroEntityMapper.map(livro));
    }
}
