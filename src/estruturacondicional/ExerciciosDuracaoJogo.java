package estruturacondicional;

import java.util.Scanner;

public class ExerciciosDuracaoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hora Inicial e Hora Final:");
        int hrInicial = sc.nextInt();
        int hrFinal = sc.nextInt();
        int duracao;

        if (hrInicial < hrFinal) {
            duracao = hrFinal - hrInicial;
        } else {
            duracao = 24 - hrInicial + hrFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
