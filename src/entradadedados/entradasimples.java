package entradadedados;

import java.util.Scanner;

public class entradasimples {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
         
        // Lendo uma palavra
        System.out.print("Digite uma palavra: ");
        String x1 = sc.next();
        System.out.println("Você digitou: " + x1); 

        // Lendo um número inteiro
        System.out.print("Digite um inteiro: ");
        int x2 = sc.nextInt();
        System.out.println("Você digitou: " + x2);
        
        // Lendo um número flutuante
        System.out.print("Digite um double: ");
        double x3 = sc.nextDouble();
        System.out.println("Você digitou: " + x3);

        // Lendo um caractere
        System.out.print("Digite um caractere: ");
        char x4 = sc.next().charAt(0);
        System.out.println("Você digitou: " + x4);

        sc.close();
    }
}
