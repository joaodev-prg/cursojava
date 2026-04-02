package estruturacondicional;

import java.util.Scanner;

public class ExerciciosParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        // Verifica Positivo ou Negativo
        if (num >= 0) {
            System.out.println("NÚMERO POSITIVO");
        } else {
            System.out.println("NÚMERO NEGATIVO");
        }

        // Verifica Par ou Ímpar
        if (num % 2 == 0) {
            System.out.println("NÚMERO PAR");
        } else {
            System.out.println("NÚMERO ÍMPAR");
        }

        sc.close();
    }
}
