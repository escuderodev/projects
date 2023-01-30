import br.com.escuderodev.view.Tela_Principal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        iniciando tela
        Tela_Principal telaPrincipal = new Tela_Principal();
        telaPrincipal.setContentPane(telaPrincipal.panelMain);
        telaPrincipal.setTitle("Cadastro de Cliente");
        telaPrincipal.setSize(500,300);
        telaPrincipal.setVisible(true);
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        chamando métodos

    }
}