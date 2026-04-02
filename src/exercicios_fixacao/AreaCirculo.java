package exercicios_fixacao;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2.0);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
