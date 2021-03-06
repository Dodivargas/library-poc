package br.com.dodivargas.livroservice.config;

import br.com.dodivargas.livroservice.repository.LivroRepository;
import br.com.dodivargas.livroservice.service.LivroService;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class Config {

    @Bean
    public LivroService livroService() {
        return new LivroService(mongoRepository());
    }

    @Bean
    public LivroRepository mongoRepository() {
        return new LivroRepository(mongoTemplate());
    }

    @Bean
    public MongoDbFactory mongoDbFactory() {
        return new SimpleMongoDbFactory(new MongoClient(), "Livro");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDbFactory());
    }
}
