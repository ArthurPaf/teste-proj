package testando2;

public class Fabricante {
    private String nome;
    private String cnpj;
    private String cidade;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return cidade;
    }

    public void setEndereco(String endereco) {
        this.cidade = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

}
