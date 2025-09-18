import java.time.LocalDate;

public class Venda {
    private Produto produto;
    private LocalDate dataVenda;
    private int NumeroVenda;
   
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    public int getNumeroVenda() {
        return NumeroVenda;
    }
    public void setNumeroVenda(int numeroVenda) {
        NumeroVenda = numeroVenda;
    }

    public void imprimirvendas(){ System.out.println("Produto: " + getProduto().getNome() + 
                           "\nMarca: " + getProduto().getMarca() + 
                           "\nPreço: " + getProduto().getPreco() + 
                           "\nQuantidade em estoque: " + getProduto().getQuantidade() + 
                           "\nNúmero da venda: " + getNumeroVenda() + 
                           "\nData da venda: " + getDataVenda());
                        }
}
