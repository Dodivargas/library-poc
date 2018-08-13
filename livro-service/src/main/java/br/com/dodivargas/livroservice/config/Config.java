package br.com.dodivargas.livroservice.config;

import br.com.dodivargas.livroservice.service.LivroService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public LivroService livroService() {
        return new LivroService();
    }
}
