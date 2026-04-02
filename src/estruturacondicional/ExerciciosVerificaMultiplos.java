package estruturacondicional;

import java.util.Scanner;

public class ExerciciosVerificaMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois valores (A e B):");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }
}
