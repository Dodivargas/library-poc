package br.com.dodivargas.livroservice.entity.mapper;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.entity.LivroEntity;

public class LivroEntityMapper {

    public static LivroEntity map(Livro livro) {
        LivroEntity livroEntity = new LivroEntity();
        livroEntity.setAutor(livro.getAutor());
        livroEntity.setGenero(livro.getGenero());
        livroEntity.setId(livro.getId());
        livroEntity.setQuantidade(livro.getQuantidade());
        livroEntity.setTitulo(livro.getTitulo());
        return livroEntity;
    }
}
