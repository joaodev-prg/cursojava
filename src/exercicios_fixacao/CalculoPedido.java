package exercicios_fixacao;

import java.util.Scanner;

public class CalculoPedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Produto 1
        int qte1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        // Produto 2
        int qte2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double total = (qte1 * preco1) + (qte2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
