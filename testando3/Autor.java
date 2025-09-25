package testando3;

public class Autor {
    
    private String nome;
    private int id;
    private String cidade;

    public Autor(String nome, int id, String cidade) {
        this.nome = nome;
        this.id = id;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean salvar() {
        System.out.println("Método salvar() da Autor executado.");
        return true;
    }

    public boolean excluir() {
        System.out.println("Método excluir() da Autor executado.");
        return true;
    }

    public boolean alterar() {
        System.out.println("Método alterar() da Autor executado.");
        return true;
    }

    public boolean pesquisar() {
        System.out.println("Método pesquisar() da Autor executado.");
        return true;
    }
  
}
