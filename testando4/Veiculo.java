package testando4;

public class Veiculo {

    private String modelo;
    private Categoria categoria;
    private Garagem garagem;
    private moto moto;
    private String nome;
    private String placa;
    private int ano;
    private String cor;
    private boolean unico_dono;

    public Veiculo(String modelo, String nome, String placa, int ano, String cor, boolean unico_dono, Categoria categoria, Garagem garagem, moto moto) {
        this.modelo = modelo;
        this.nome = nome;
        this.placa = placa;
        this.ano = ano;
        this.garagem = garagem;
        this.moto = moto;
        this.categoria = categoria;
        this.cor = cor;
        this.unico_dono = unico_dono;
    }
    public String getModelo() {
        return modelo;
    }
    public String getNome() {
        return nome;
    }
    public String getPlaca() {
        return placa;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public boolean isUnico_dono() {
        return unico_dono;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setUnico_dono(boolean unico_dono) {
        this.unico_dono = unico_dono;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public Garagem getGaragem() {
        return garagem;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }
    public moto getMoto() {
        return moto;
    }
    public void setMoto(moto moto) {
        this.moto = moto;
    }

    
   


}
