package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.models.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(Model model) {
        var pedido = new Pedido();
        pedido.setNomeProduto("Novo Kindle 11ª Geração");
        pedido.setUrlDaImagem("https://m.media-amazon.com/images/I/71B1wzw1LkL._AC_SL1500_.jpg");
        pedido.setUrlDoProduto("https://www.amazon.com.br/dp/B09SWTG9GF?pf_rd_r=5CNX8GXCQXW1XTE28RDR&pf_rd_p=3c61fcb5-9a58-4378-9bda-9f6a28fa21fd&pd_rd_r=28852cd4-603e-4f49-ab4f-04a936bf0e1b&pd_rd_w=pCSiN&pd_rd_wg=IOGIX&ref_=pd_gw_unk");
        pedido.setDescricao("Conheça o Kindle, que agora conta com uma aprimorada tela de alta resolução, o dobro do armazenamento, carregamento por USB-C e bateria de duração mais longa. A luz frontal embutida ajustável e o novo recurso de modo noturno permitem uma leitura confortável em ambientes abertos ou fechados a qualquer hora do dia.");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("listaDePedidos", pedidos);
        return "home";
    }
}
