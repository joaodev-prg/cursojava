package FuncoesStrings;

public class funcoesSimples {
    
    public static void main (String[] args) {
       // Texto original com espaços no final e letras variadas (maiúsculas e minúsculas)
        String original = "abcd FGHIJ ABC abc DEFG   ";

        // Converte todo o texto para letras MINÚSCULAS
        String s1 = original.toLowerCase();

        // Converte todo o texto para letras MAIÚSCULAS
        String s2 = original.toUpperCase();

        // Remove os espaços em branco extras no INÍCIO e no FIM da String
        String s3 = original.trim();

        // Cria uma nova String começando a partir do índice 2 até o final
        String s4 = original.substring(2);

        // Cria uma nova String que começa no índice 2 e vai ATÉ o índice 9 (o 9 não entra)
        String s5 = original.substring(2, 9);

        // Troca todo caractere 'a' (minúsculo) pelo caractere 'x'
        String s6 = original.replace('a', 'x');

        // Troca toda sequência de texto "abc" pela sequência "xy"
        String s7 = original.replace("abc", "xy");

        // Retorna a posição (índice) da PRIMEIRA vez que "bc" aparece no texto
        int i = original.indexOf("bc");

        // Retorna a posição (índice) da ÚLTIMA vez que "bc" aparece no texto
        int j = original.lastIndexOf("bc");

        // --- IMPRESSÃO DOS RESULTADOS ---
        System.out.println("original:  -" + original + "-");
        System.out.println("toLowerCase: " + s1 + "-"); 
        System.out.println("toUpperCase: " + s2 + "-"); 
        System.out.println("trim:  -" + s3 + "-");
        System.out.println("substring(2):  -" + s4 + "-");
        System.out.println("substring(2, 9):  -" + s5 + "-");
        System.out.println("replace('a', 'x'):  -" + s6 + "-");
        System.out.println("replace('abc', 'xy'):  -" + s7 + "-");
        System.out.println("index of 'bc': " + i);
        System.out.println("last index of 'bc': " + j);
    }
}
