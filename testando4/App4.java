package testando4;

public class App4 {
    
    public static void main(String[] args) {
        
        Categoria cat1 = new Categoria("SUV");
        Categoria cat2 = new Categoria("Esportiva");
        

        Garagem gar1 = new Garagem("Garagem do João", "São Paulo");
        Garagem gar2 = new Garagem("Garagem da Maria", "Rio de Janeiro");
       

        Veiculo moto1 = new Veiculo("Honda CB500F", "CB500F", "XYZ-5678", 2021, "Vermelha", false, cat2, gar2, null);        
         
        Veiculo veic1 = new Veiculo("Toyota RAV4", "RAV4", "ABC-1234", 2022, "Prata", true, cat1, gar1, null);        
         
        

        
        Carros carro1 = new Carros(veic1, 203, 8, "Teto solar, Bancos de couro");
        System.out.println("Carro: " + carro1.getVeiculo().getModelo() +  " Ano: " + carro1.getVeiculo().getAno());
        System.out.println("Categoria: " + carro1.getVeiculo().getCategoria().getDescricao());
        System.out.println("Garagem: " + carro1.getVeiculo().getGaragem().getNome() + ", Cidade: " + carro1.getVeiculo().getGaragem().getCidade());
        System.out.println("Motorização: " + carro1.getMotorizacao_cv() + " cv, Marchas: " + carro1.getQtde_marcha());
        System.out.println("Opcionais: " + carro1.getOpcionais());
        System.out.println("placa: " + carro1.getVeiculo().getPlaca());
        System.out.println("Cor: " + carro1.getVeiculo().getCor());
        System.out.println("Único dono: " + (carro1.getVeiculo().isUnico_dono() ? "Sim" : "Não"));
        System.out.println();
        System.out.println("Moto: " + moto1.getModelo() +  " Ano: " + moto1.getAno());
        System.out.println("Categoria: " + moto1.getCategoria().getDescricao());
        System.out.println("Garagem: " + moto1.getGaragem().getNome() + ", Cidade: " + moto1.getGaragem().getCidade()); 
        System.out.println("placa: " + moto1.getPlaca());
        System.out.println("Cor: " + moto1.getCor());
        System.out.println("Único dono: " + (moto1.isUnico_dono() ? "Sim" : "Não"));  


        Generica gen = new Generica();
        gen.alternar();

        Generica gen2 = new Generica();
        gen2.excluir();

        Generica gen3 = new Generica();
        gen3.salvar();
}
}
