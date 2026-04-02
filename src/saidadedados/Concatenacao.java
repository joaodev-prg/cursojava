package saidadedados;

public class Concatenacao {
    public static void main(String[] args) {
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        // Concatenando com o operador '+' (Mais comum)
        System.out.println(nome + " tem " + idade + " anos e ganha R$ " + renda);

        // Concatenando com printf (Mais profissional e organizado)
        // %s = String | %d = Inteiro | %f = Double
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        
    }
}
