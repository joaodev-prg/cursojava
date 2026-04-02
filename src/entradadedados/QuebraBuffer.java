package entradadedados;

import java.util.Scanner;

public class QuebraBuffer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        System.out.println("Digite um número e depois 3 frases:");
        x = sc.nextInt();
        sc.nextLine(); // Limpando o buffer (o Enter que sobrou do nextInt)
        
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
