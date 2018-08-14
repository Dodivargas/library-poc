package br.com.dodivargas.livroservice.service;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.mapper.LivroMapper;
import br.com.dodivargas.livroservice.repository.MongoRepository;

public class LivroService {

    private MongoRepository mongoRepository;

    public LivroService(MongoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    public Livro getLivro(String id) {
        return LivroMapper.map(mongoRepository.findById(id));
    }

}
