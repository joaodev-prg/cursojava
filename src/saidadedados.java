public class saidadedados {
    public static void main(String[] args)  {
     /*   int j = 32;
       String nome = "maria";
       int idade = 31;
       double renda = 4000.0;

       double x = 10.25784 ; 
        System.out.println(j);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.printf("%s tem %d anos e ganha r$ %.2f reais%n", nome, idade, renda);*/
        
       String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567; 
       
        System.out.printf(
        "Products:%n" +
            "%s, which price is $ %.2f%n" +
            "%s, which price is $ %.2f%n%n" +
            "Record: %d years old, code %d and gender: %c%n%n" +
            "Measure with eight decimal places: %.8f%n" +
            "Rounded (three decimal places): %.3f%n" +
            "US decimal point: %.3f%n", 
            product1, price1, product2, price2, age, code, gender, measure, measure, measure
        );
    }
    
}
