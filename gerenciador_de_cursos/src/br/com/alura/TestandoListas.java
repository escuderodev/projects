package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestandoListas {

    public static void main(String[] args) {

        String aula2 = "Spring";
        String aula1 = "Java";
        String aula3 = "MySql";

        List<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println("\nimprimindo com array");
        System.out.println(aulas);

        System.out.println("\npercorrendo a lista");
        aulas.forEach(System.out::println);
        aulas.forEach(aula -> {
            System.out.println("Percorrendo..." + aula);
        });

        System.out.println("\nremovendo itens");
        aulas.remove(aula3);
        System.out.println(aulas);

        System.out.println("\nordernando lista");
        Collections.sort(aulas);

        System.out.println("\npegando itens por index");
        System.out.println(aulas.get(1));
    }
}
