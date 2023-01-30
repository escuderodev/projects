package br.com.escuderodev.view;

import br.com.escuderodev.dao.ClienteDAO;
import br.com.escuderodev.dao.ConexaoDAO;
import br.com.escuderodev.dto.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Principal extends javax.swing.JFrame {
    private JTextField textTelefone;
    private JTextField textNome;
    private JButton salvarButton;
    public JPanel panelMain;

    public Tela_Principal() {
    salvarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
//            JOptionPane.showMessageDialog(salvarButton, "Nome: " + textNome.getText() + " - Telefone: " + textTelefone.getText());
            String name = textNome.getText();
            String fone = textTelefone.getText();

            if(!isCamposValidos(name,fone)) {
                JOptionPane.showMessageDialog(null, "Existem campos obrigatórios não preenchidos.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Cliente cliente = new Cliente(name, fone);
                limpaCampos();
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
//                JOptionPane.showMessageDialog(salvarButton, "Nome: " + cliente.getNome() + " - Telefone: " + cliente.getTelefone());

//                criando a DAO e enviando os objetos criados
                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.cadastrarCliente(cliente);

            }
        }
    });
}

    private void limpaCampos() {
        textNome.setText("");
        textTelefone.setText("");
    }

    private boolean isCamposValidos(String ...campos) {
        for (String campo : campos) {
            if (campos == null || "".equals(campo)) {
                return false;
            }
        }
        return true;
    }

}
