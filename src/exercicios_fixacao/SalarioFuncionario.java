package exercicios_fixacao;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
