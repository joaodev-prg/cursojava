package estruturafor;

import java.util.Scanner;

public class exercicio6 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
          // "Ler um número inteiro N"
        int n = sc.nextInt();

        // "Calcular todos os seus divisores"
        // Iniciamos o laço em 1 (pois não existe divisão por 0) e vamos até o próprio N
        for (int i = 1; i <= n; i++) {
            
            // Um número 'i' é divisor de 'N' se o resto da divisão de N por i for zero
            if (n % i == 0) {
                // Se a condição for verdadeira, imprimimos o divisor
                System.out.println(i);
            }
        }
            sc.close();
        }
}
