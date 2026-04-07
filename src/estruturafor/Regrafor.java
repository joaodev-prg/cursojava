package estruturafor;



public class Regrafor {

    public static void main(String[] args) {
  // --- PRIMEIRA ESTRUTURA: CONTAGEM SIMPLES ---
        System.out.println("--- Contagem Crescente ---"); // Exibe um título no terminal

        // Início: i começa em 1 | Condição: enquanto i for menor ou igual a 5 | Passo: i ganha +1
        for (int i = 1; i <= 5; i++) { 
            // Esta linha abaixo será repetida 5 vezes:
            System.out.println("Valor de i: " + i); // Imprime o texto "Valor de i: " seguido do número atual
        } // O Java volta para o topo do 'for', aumenta o 'i' e testa a condição de novo

        // --- SEGUNDA ESTRUTURA: PULANDO NÚMEROS ---
        System.out.println("\n--- Números Pares ---"); // \n serve para pular uma linha no terminal

        // Início: j começa em 0 | Condição: enquanto j for menor ou igual a 10 | Passo: j ganha +2
        for (int j = 0; j <= 10; j += 2) {
            // j += 2 faz o contador pular: 0, 2, 4, 6, 8, 10
            System.out.println("Valor de j: " + j); // Imprime o valor atual de 'j'
        } // Quando 'j' chegar a 12, a condição (12 <= 10) será falsa e o laço para

    } // Fecha o bloco do método main
} // Fecha o bloco da classe
