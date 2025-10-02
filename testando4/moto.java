package testando4;

public class moto {

    private Veiculo veiculo;
    private int cilindrada;

    public moto(Veiculo veiculo, int cilindrada) {
        this.veiculo = veiculo;
        this.cilindrada = cilindrada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
