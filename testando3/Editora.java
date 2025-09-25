package testando3;

public class Editora {
    
    private String nome_editora;
    private int id;

    public Editora(String nome_editora, int id) {
        this.nome_editora = nome_editora;
        this.id = id;
    }

    public String getNome_editora() {
        return nome_editora;
    }

    public int getId() {
        return id;
    }

    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean salvar() {
        System.out.println("Método salvar() da Editora executado.");
        return true;
    }

    public boolean excluir() {
        System.out.println("Método excluir() da Editora executado.");
        return true;
    }

    public boolean alterar() {
        System.out.println("Método alterar() da Editora executado.");
        return true;
    }

    public boolean pesquisar() {
        System.out.println("Método pesquisar() da Editora executado.");
        return true;
    }



}
