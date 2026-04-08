package estruturafor;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

       // Configura o ponto como separador decimal
              Scanner sc = new Scanner(System.in);
      
              // Lendo a quantidade de casos de teste
              int n = sc.nextInt();
      
              for (int i = 0; i < n; i++) {
                  // Lendo os três valores reais
                  double v1 = sc.nextDouble();
                  double v2 = sc.nextDouble();
                  double v3 = sc.nextDouble();
      
                  // Cálculo da média ponderada
                  double media = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10.0;
      
                  // Apresentando o resultado com uma casa decimal
                  System.out.printf("%.1f%n", media);
            

        }
            sc.close();
    }

}
