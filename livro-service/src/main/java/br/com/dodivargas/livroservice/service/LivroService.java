package br.com.dodivargas.livroservice.service;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.entity.mapper.LivroEntityMapper;
import br.com.dodivargas.livroservice.mapper.LivroMapper;
import br.com.dodivargas.livroservice.repository.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
