import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Autor extends JFrame {

    // Componentes da interface
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtCidade; 
    
    private JButton btnSalvar;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnPesquisar;
    private JButton btnLimpar;
    private JButton btnSair;

    public Autor() {
        setTitle("Cadastro de Autor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); 
        setLocationRelativeTo(null); 

        inicializarComponentes();

        setVisible(true);
    }

    private void inicializarComponentes() {
        JPanel painelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
      

        // ID
        gbc.gridx = 0; gbc.gridy = 0; painelPrincipal.add(new JLabel("ID:"), gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        txtId = new JTextField(15);
        painelPrincipal.add(txtId, gbc);

        // Nome
        gbc.gridx = 0; gbc.gridy = 1; gbc.fill = GridBagConstraints.NONE; gbc.weightx = 0;
        painelPrincipal.add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        txtNome = new JTextField(15);
        painelPrincipal.add(txtNome, gbc);

        // Cidade
        gbc.gridx = 0; gbc.gridy = 2; gbc.fill = GridBagConstraints.NONE; gbc.weightx = 0;
        txtCidade = new JTextField(15); 
        painelPrincipal.add(new JLabel("Cidade:"), gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        painelPrincipal.add(txtCidade, gbc);

        // Painel de Botões 
        JPanel painelAcoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

       
        btnSalvar.addActionListener(e -> salvar());
        btnAlterar.addActionListener(e -> alterar());
        btnExcluir.addActionListener(e -> excluir());
        btnPesquisar.addActionListener(e -> pesquisar());
        btnLimpar.addActionListener(e -> limparCampos());
        btnSair.addActionListener(e -> System.exit(0));

        painelAcoes.add(btnSalvar);
        painelAcoes.add(btnAlterar);
        painelAcoes.add(btnExcluir);
        painelAcoes.add(btnPesquisar);
        painelAcoes.add(btnLimpar);
        painelAcoes.add(btnSair);

        gbc.gridx = 0;
        gbc.gridy = 3; 
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelPrincipal.add(painelAcoes, gbc);

        add(painelPrincipal);
        pack(); 
    }
    
   

    
    public boolean salvar() {
        
        
        // Lógica de escrita no arquivo
        String id = txtId.getText().trim();
        String nome = txtNome.getText().trim();
        String cidade = txtCidade.getText().trim();
        
        // Formato: ID;NOME;CIDADE
        String linha = String.format("%s;%s;%s", id, nome, cidade);
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("autores.txt", true))) {
            writer.println(linha);
            
            JOptionPane.showMessageDialog(this, 
                "Autor salvo com sucesso no arquivo! (Campos vazios permitidos)", 
                "Salvo", 
                JOptionPane.INFORMATION_MESSAGE);
            
            limparCampos();
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao salvar no arquivo: " + ex.getMessage(), 
                "Erro de I/O", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Método alterar(): Simulação
    public boolean alterar() {
        JOptionPane.showMessageDialog(this, 
            "Método 'Alterar' executado.", 
            "Alterar", 
            JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    // Método excluir(): Simulação
    public boolean excluir() {
        JOptionPane.showMessageDialog(this, 
            "Método 'Excluir' executado.", 
            "Excluir", 
            JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    // Método pesquisar(): Simulação
    public boolean pesquisar() {
        JOptionPane.showMessageDialog(this, 
            "Método 'Pesquisar' executado.", 
            "Pesquisar", 
            JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCidade.setText("");
        txtId.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Autor());
    }
}