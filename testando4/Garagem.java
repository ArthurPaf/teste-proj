package testando4;

public class Garagem {

    private String nome;
    private String cidade;

    public Garagem(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}
