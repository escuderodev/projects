import br.com.escuderodev.view.TelaPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setContentPane(telaPrincipal.painelPrincipal);
        telaPrincipal.setTitle("Descubra sua alicota de desconto do INSS");
        telaPrincipal.setSize(450,300);
        telaPrincipal.setVisible(true);
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setResizable(false);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}