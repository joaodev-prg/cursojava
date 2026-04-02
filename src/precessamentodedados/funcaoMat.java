package precessamentodedados;

public class funcaoMat {
    public static void main(String[] args)  {

         // exemplo de processamento de dados 4 utilizando funções matemáticas

         double x = 3.0;
         double y = 4.0;
         double z = -5.0;
         double a, b, c;

         a = Math.sqrt(x);
         b = Math.sqrt(y);
         c = Math.sqrt(25.0);
     

         System.out.println("a raiz quadrada de " + x + " = " + a);
         System.out.println("a raiz quadrada de " + x + " = " + b);
         System.out.println("a raiz quadrada de 25 = " + c);

         a = Math.pow(x,y);
         b = Math.pow(x, 2.0);
         c = Math.pow(5.0, 2.0);

         System.out.println(x + " elevado a " + y + " = " + a);
         System.out.println(x + " elevado ao quadrado = " + b);
         System.out.println("5 elevado ao quadrado = " + c);

         a = Math.abs(y);
         b = Math.abs(z);

         System.out.println("valor absoluto de " + y + " = " + a);
         System.out.println("valor absoluto de " + z + " = " + b);
        }
}
