package estruturacondicional;

import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        // Estrutura Composta: Verifica se o número é par ou ímpar
        // O operador % pega o resto da divisão. Se o resto por 2 for 0, é par.
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        sc.close();
    }
}
