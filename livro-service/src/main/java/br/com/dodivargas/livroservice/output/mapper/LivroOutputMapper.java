package br.com.dodivargas.livroservice.output.mapper;

import br.com.dodivargas.livroservice.dto.Livro;
import br.com.dodivargas.livroservice.output.LivroOutput;

public class LivroOutputMapper {

    public static LivroOutput map(Livro livro) {
        LivroOutput livroOutput = new LivroOutput();
        livroOutput.setId(livro.getId());
        livroOutput.setAutor(livro.getAutor());
        livroOutput.setGenero(livro.getGenero());
        livroOutput.setTitulo(livro.getTitulo());
        livroOutput.setQuantidade(livro.getQuantidade());
        return livroOutput;
    }

}
