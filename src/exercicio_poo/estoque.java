package exercicio_poo;

import java.util.Scanner;

public class estoque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        programa produto = new programa();
        System.out.println("dados do produto");
        System.out.println("nome");
        produto.nome = sc.nextLine();
        System.out.println("preço");
        produto.preço = sc.nextDouble();
        System.out.println("quantidade no estoque ?");
        produto.quantidade = sc.nextInt();
        System.out.println(produto);

        sc.close();

    }

}
