package testando3;

public class App3 {
    public static void main(String[] args) {
        
        Autor autor = new Autor("João Silva", 1, "São Paulo");
        Editora editora = new Editora("Editora Exemplo", 1);
        TipoCapa tipoCapa = new TipoCapa(1, "Dura");
        Livro livro = new Livro(1, "Java", "Um livro sobre Java.", editora, 1, 2023, 300, tipoCapa, autor);
        
        System.out.println("Livro: " + livro.getNome());
        System.out.println("Resenha: " + livro.getResenha());
        System.out.println("Editora: " + livro.getEditora().getNome_editora());
        System.out.println("Edição: " + livro.getEdicao());
        System.out.println("Ano de Publicação: " + livro.getAno_publicacao());
        System.out.println("Número de Páginas: " + livro.getN_paginas());
        
        
        
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Cidade: " + autor.getCidade());
        
        
        System.out.println("Tipo de Capa: " + tipoCapa.getDescricao());
    }
}