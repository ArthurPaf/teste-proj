public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();
        produto1.setNome("Macarrão");
        produto1.setMarca("Renata");
        produto1.setPreco(5.99);
        produto1.setQuantidade(20);

        Produto produto2 = new Produto();
        produto2.setNome("Extrato de tomate");
        produto2.setMarca("Elefante");  
        produto2.setPreco(3.99);
        produto2.setQuantidade(20);

        Venda venda1 = new Venda();
        venda1.setProduto(produto1);
        venda1.setNumeroVenda(1);
        venda1.setDataVenda(java.time.LocalDate.now());

        Venda venda2 = new Venda();
        venda2.setProduto(produto2);   
        venda2.setNumeroVenda(2);
        venda2.setDataVenda(java.time.LocalDate.now());
        
        venda1.imprimirvendas();  
        
       
    }
}
