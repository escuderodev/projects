import br.com.escuderodev.models.Atendimento;
import br.com.escuderodev.models.RoteadorDeChamado;
import br.com.escuderodev.models.TipoDeAtendimento;
import br.com.escuderodev.models.ValidaAtendimento;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\n===== SISTEMA DE ABERTURA DE CHAMADOS =====");

        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite a classificação do chamado: ");
        String classificacao = input.next();
        Atendimento atendimento = new Atendimento(classificacao.toUpperCase());

        ValidaAtendimento validaAtendimento = new ValidaAtendimento();
        TipoDeAtendimento tipoDeAtendimento = validaAtendimento.validaTipoAtendimento(atendimento.getTipoDeAtendimento());

        System.out.println("Tipo Atendimento: " + atendimento.getTipoDeAtendimento());

        RoteadorDeChamado roteador = new RoteadorDeChamado();
        System.out.println("Status do Atendimento: " + roteador.rotear(atendimento, tipoDeAtendimento));

        System.out.println("\n===== Fim do programa =====");
    }
}