package FuncoesStrings;

public class OperacaoSplit {
    public static void main(String[] args){
     // Define uma String simples com palavras separadas por espaços
        String s = "potato apple lemon";
        
        /**
         * O método split(" ") "corta" a String original toda vez que encontra um espaço.
         * Ele guarda cada pedaço cortado dentro de um array de Strings (String[]).
         * O resultado aqui será um vetor onde:
         * posição 0 = "potato"
         * posição 1 = "apple"
         * posição 2 = "lemon"
         */
        String[] vect = s.split(" ");

        // Acessa e imprime o primeiro elemento do array (índice 0)
        System.out.println(vect[0]);
        
        // Acessa e imprime o segundo elemento do array (índice 1)
        System.out.println(vect[1]);
        
        // Acessa e imprime o terceiro elemento do array (índice 2)
        System.out.println(vect[2]);
    }

}
