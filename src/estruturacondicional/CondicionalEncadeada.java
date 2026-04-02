package estruturacondicional;

import java.util.Scanner;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();

        // Estrutura Encadeada: Várias condições em sequência
        if (idade < 16) {
            System.out.println("Não pode votar.");
        } 
        else if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } 
        else {
            System.out.println("Voto facultativo (opcional).");
        }

        sc.close();
    }
}
