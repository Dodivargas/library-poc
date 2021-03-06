package br.com.dodivargas.livroservice.repository;

import br.com.dodivargas.livroservice.entity.LivroEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LivroRepository {

    private MongoTemplate mongoTemplate;

    @Autowired
    public LivroRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public LivroEntity findById(String id) {
        return mongoTemplate.findById(id, LivroEntity.class);
    }

    public List<LivroEntity> find() {
        return mongoTemplate.findAll(LivroEntity.class);
    }

    public void insert(LivroEntity livroEntity) {
        mongoTemplate.insert(livroEntity);
    }

    public void delete(LivroEntity livroEntity) {
        mongoTemplate.remove(livroEntity);
    }

}
