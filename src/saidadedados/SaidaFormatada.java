package saidadedados;

import java.util.Locale;

public class SaidaFormatada {
    public static void main(String[] args) {
        
        double medida = 25.45678;
        double preco = 1500.0;
        
        // %f = ponto flutuante (double/float)
        // %.2f = limita a 2 casas decimais
        // %n = pula linha (independente do sistema operacional)
        System.out.printf("Medida com várias casas: %f%n", medida);
        System.out.printf("Medida arredondada (2 casas): %.2f%n", medida);
        
        // Locale: Serve para mudar o separador de decimal para ponto (EUA)
        // sem isso, o Java usa o padrão do seu Windows (vírgula no Brasil)
        Locale.setDefault(Locale.US);
        System.out.printf("Preço no padrão US: %.2f%n", preco);
        
    }
}
