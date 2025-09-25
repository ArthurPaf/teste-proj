package testando3;

public class Livro {
   
    private int id;
    private String nome;
    private String resenha;
    private TipoCapa tipoCapa; 
    private Autor autor; 
    private Editora editora; 
    private int edicao;
    private int ano_publicacao;
    private int n_paginas;

    public Livro(int id, String nome, String resenha, Editora editora, int edicao, int ano_publicacao, int n_paginas, TipoCapa tipoCapa, Autor autor) {
        this.id = id;
        this.nome = nome;
        this.resenha = resenha;
        this.editora = editora;
        this.edicao = edicao;
        this.ano_publicacao = ano_publicacao;
        this.n_paginas = n_paginas;
        this.tipoCapa = tipoCapa;
        this.autor = autor;

    }

    public TipoCapa getTipoCapa() {
        return tipoCapa;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getResenha() {
        return resenha;
    }

    public Editora getEditora() {
        return editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean salvar() {
        System.out.println("Método salvar() do Livro executado.");
        return true;
    }

    public boolean excluir() {
        System.out.println("Método excluir() do Livro executado.");
        return true;
    }

    public boolean alterar() {
        System.out.println("Método alterar() do Livro executado.");
        return true;
    }

    public boolean pesquisar() {
        System.out.println("Método pesquisar() do Livro executado.");
        return true;
    }

}
