package testando2;

public class App2 {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setModelo("Fiat Uno");
        veiculo1.setPlaca("ABC-1234");
        veiculo1.setAno(2013);
        veiculo1.setQuantidade(5);
        veiculo1.setId(1);

        
        System.out.println("Veículo 1:");
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Ano: " + veiculo1.getAno());
        System.out.println("Quantidade: " + veiculo1.getQuantidade());
        System.out.println("ID: " + veiculo1.getId());
        System.out.println();

        Fabricante fabricante1 = new Fabricante();
        fabricante1.setNome("Fiat");
        fabricante1.setCnpj("12.345.678/0001-90");
        fabricante1.setEndereco("Rua A, 123, São Paulo, SP");
        fabricante1.setId(1);
        
        System.out.println();
        System.out.println("Fabricante 1:");
        System.out.println("Nome: " + fabricante1.getNome());
        System.out.println("CNPJ: " + fabricante1.getCnpj());
        System.out.println("Endereço: " + fabricante1.getEndereco());
        System.out.println("ID: " + fabricante1.getId());
        
    }



}
