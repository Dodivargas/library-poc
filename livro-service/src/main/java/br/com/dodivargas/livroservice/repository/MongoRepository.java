package br.com.dodivargas.livroservice.repository;

import br.com.dodivargas.livroservice.dto.Livro;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoRepository {

    private MongoTemplate mongoTemplate;

    public MongoRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void insert() {
        mongoTemplate.insert(new Livro());
    }


}
