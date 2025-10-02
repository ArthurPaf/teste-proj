package testando4;

public class Carros {

    private Veiculo veiculo;
    private int motorizacao_cv;
    private int qtde_marcha;
    private String opcionais;

    public Carros(Veiculo veiculo, int motorizacao_cv, int qtde_marcha, String opcionais) {
        this.veiculo = veiculo;
        this.motorizacao_cv = motorizacao_cv;
        this.qtde_marcha = qtde_marcha;
        this.opcionais = opcionais;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    public int getMotorizacao_cv() {
        return motorizacao_cv;
    }
    public int getQtde_marcha() {
        return qtde_marcha;
    }
    public String getOpcionais() {
        return opcionais;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public void setMotorizacao_cv(int motorizacao_cv) {
        this.motorizacao_cv = motorizacao_cv;
    }
    public void setQtde_marcha(int qtde_marcha) {
        this.qtde_marcha = qtde_marcha;
    }
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    

}
