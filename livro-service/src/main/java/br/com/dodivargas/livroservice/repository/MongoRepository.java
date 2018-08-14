package br.com.dodivargas.livroservice.repository;

import br.com.dodivargas.livroservice.entity.LivroEntity;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoRepository {

    private MongoTemplate mongoTemplate;

    public MongoRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public LivroEntity findById(String id) {
        return mongoTemplate.findById(id, LivroEntity.class);
    }
}
