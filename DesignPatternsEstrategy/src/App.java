import br.com.escuderodev.models.*;

import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {

        Produto produto = new Produto("Kit de Brigadeiro com 12 unidades", 100);
        FreteService frete = new MercadoEnvios();
        DecimalFormat decimal = new DecimalFormat();
        decimal.applyPattern("0.00");

        System.out.println(String.format(String.format("\nO Produto " + produto.getNome() + " será entregue pela Empresa " + frete.getClass().getSimpleName() + " e o valor do frete será R$ " + decimal.format(frete.calculaFrete(produto.getPeso())) + ".")));
    }
}

//..