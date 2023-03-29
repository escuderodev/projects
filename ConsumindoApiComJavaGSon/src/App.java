import br.com.escuderodev.models.Cliente;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Cliente> listaDeClientes = new ArrayList<>();

        Cliente cliente1 = new Cliente();
        cliente1.setCodigo(1);
        cliente1.setNome("Eduardo Escudero");
        cliente1.setDtNascimento(new Timestamp(System.currentTimeMillis()));
        cliente1.setEmail("escuderodev@gmail.com");

        Cliente cliente2 = new Cliente();
        cliente2.setCodigo(2);
        cliente2.setNome("Juan Tobias Escudero");
        cliente2.setDtNascimento(new Timestamp(System.currentTimeMillis()));
        cliente2.setEmail("juan@gmail.com");

        listaDeClientes.add(cliente1);
        listaDeClientes.add(cliente2);

        System.out.println("Arraylist: " + listaDeClientes);

//        convertendo objeto cliente1 para json
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy HH:mm:ss").create();
        System.out.println("Json: " + gson.toJson(cliente1, Cliente.class));

//        convertendo um arraylist para json com type do pacote reflection
        Type type = new TypeToken<List<Cliente>>(){}.getType();
        System.out.println("ArrayList convertido para JSON: " + gson.toJson(listaDeClientes, type));

//        convertendo um json para objeto java
        String json = gson.toJson(listaDeClientes, type);
        List<Cliente> listaRetornoCliente = gson.fromJson(json, type);

//        visualizando os atributos do cliente recebidos no json
        System.out.println("Código: " + listaRetornoCliente.get(0).getCodigo());
        System.out.println("Nome: " + listaRetornoCliente.get(0).getNome());
        System.out.println("Data de Nascimento: " + listaRetornoCliente.get(0).getDtNascimento());
        System.out.println("e-mail: " + listaRetornoCliente.get(0).getEmail());

    }
}