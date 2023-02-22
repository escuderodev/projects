package br.com.escuderodev.view;

import br.com.escuderodev.models.INSS;
import br.com.escuderodev.models.Salario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    public JPanel painelPrincipal;
    private JTextField txtSalario;
    private JLabel lbSalario;
    private JButton calcularButton;
    private JButton limparButton;
    private JTextField txtResultado;
    private JTextArea txtaResultado;


    public TelaPrincipal() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Salario salario = new Salario();
                double salarioDigitado = Double.parseDouble(txtSalario.getText());

                INSS imposto = new INSS();
                String alicota = imposto.calculaAlicota(salarioDigitado);
                txtResultado.setText(alicota);
            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpaCampos();
            }
        });
    }

    private void limpaCampos() {
        txtSalario.setText("");
        txtResultado.setText("");
    }
}
