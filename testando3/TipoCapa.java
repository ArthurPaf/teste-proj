package testando3;

public class TipoCapa {

    private int id;
    private String descricao;

    public TipoCapa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean salvar() {
        System.out.println("Método salvar() da TipoCapa executado.");
        return true;
    }

    public boolean excluir() {
        System.out.println("Método excluir() da TipoCapa executado.");
        return true;
    }

    public boolean alterar() {
        System.out.println("Método alterar() da TipoCapa executado.");
        return true;
    }

    public boolean pesquisar() {
        System.out.println("Método pesquisar() da TipoCapa executado.");
        return true;
    }
}
