package estruturacondicional;

import java.util.Scanner;

public class CondicionalSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota:");
        double nota = sc.nextDouble();

        // Estrutura Simples: apenas o 'if'
        if (nota >= 6.0) {
            System.out.println("Parabéns, você foi aprovado!");
        }

        System.out.println("Fim do programa.");
        sc.close();
    }
}
