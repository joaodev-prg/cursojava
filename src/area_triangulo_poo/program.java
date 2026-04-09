package area_triangulo_poo;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("digite a medida do triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("digite a medida do triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.b = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        if (areax > areaY) {
            System.out.println("Largura area: X");
        } else {
            System.out.println("Largura area: Y");
        }
        sc.close();
    }

}
