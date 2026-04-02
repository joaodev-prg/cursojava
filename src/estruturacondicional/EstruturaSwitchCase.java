package estruturacondicional;

import java.util.Scanner;

public class EstruturaSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia da semana (1 a 7):");
        int dia = sc.nextInt();

        String nomeDia;

        // Switch Case: Mais limpo que vários 'if' para valores exatos
        switch (dia) {
            case 1: nomeDia = "Domingo"; break;
            case 2: nomeDia = "Segunda-feira"; break;
            case 3: nomeDia = "Terça-feira"; break;
            case 4: nomeDia = "Quarta-feira"; break;
            case 5: nomeDia = "Quinta-feira"; break;
            case 6: nomeDia = "Sexta-feira"; break;
            case 7: nomeDia = "Sábado"; break;
            default: nomeDia = "Dia inválido"; break;
        }

        System.out.println("Dia escolhido: " + nomeDia);
        sc.close();
    }
}
