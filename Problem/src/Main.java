import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = input.nextInt();
        int[] numeros = new int[tamanho];
        int contador = 0;

        while (contador < numeros.length) {
            System.out.print("Digite um número: ");
            numeros[contador] = input.nextInt();
            contador++;
        }

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

    }
}