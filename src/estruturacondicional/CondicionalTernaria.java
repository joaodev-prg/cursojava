package estruturacondicional;

import java.util.Scanner;

public class CondicionalTernaria {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
           int x = 10;
        String resultado = (x > 5) ? "maior que 5" : "menor ou igual a 5";
        System.out.println(resultado);
        
        
        double preco = sc.nextDouble();
        double desconto ;
        if (preco < 100){
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.5;
        }
        System.out.println("Desconto: " + desconto);

       
        sc.close();

    }
}

