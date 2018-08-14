package br.com.dodivargas.livroservice.mapper;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.entity.LivroEntity;

public class LivroMapper {

    public static Livro map(LivroEntity livroEntity) {
        Livro livro = new Livro();
        livro.setGenero(livroEntity.getGenero());
        livro.setAutor(livroEntity.getAutor());
        livro.setQuantidade(livroEntity.getQuantidade());
        livro.setTitulo(livroEntity.getTitulo());
        livro.setId(livroEntity.getId());
        return livro;
    }
}
