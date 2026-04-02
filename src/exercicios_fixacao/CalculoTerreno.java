
package exercicios_fixacao;

import java.util.Scanner;

public class CalculoTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double valorMetro = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorMetro;

        System.out.printf("ÁREA = %.2f%n", area);
        System.out.printf("PREÇO = %.2f%n", preco);

        sc.close();
    }
}