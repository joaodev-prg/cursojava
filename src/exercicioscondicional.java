/* 
    import java.util.Scanner; // Importa a classe Scanner para permitir a entrada de dados pelo teclado

public class exercicioscondicional {
    
    public static void main(String[] args) {
       
        // Cria um objeto 'sc' do tipo Scanner para ler o que o usuário digitar
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");

        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("numero positivo");

        }
        else{
            System.out.println("numero negativo");
        }
        
        
        System.out.println("digite um numero:");
        int num = sc.nextInt();

        if(num % 2 == 0){
                System.out.println("numero e par");
        }
        else{
            System.out.println("numero e impar");
        }

        
        System.out.println("informe o valor de a e b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("sao mutiplos");
        }
        else{
            System.out.println("nao sao mutiplos");
        }

     
        System.out.println("informe dois valores: ");
        int hrinicial = sc.nextInt();
        int hrfinal = sc.nextInt();
        int duracao;

        if(hrinicial< hrfinal){
            
            duracao = hrfinal - hrinicial;
        }
        else{
            duracao = 24 - hrinicial + hrfinal;
        }

        System.out.println("o jogo durou " + duracao + "horas");


        int cod = sc.nextInt();
        int qtd = sc.nextInt();

        double total;

        if(cod == 1){
            total = qtd * 4.00;
        }
        else if(cod == 2){
            total = qtd * 4.50;
        }
        else if(cod == 3){
            total = qtd * 5.0;
        }
        else if (cod == 4) {
            total = qtd * 2.00;
        } 
        else if (cod == 5) {
            total = qtd * 1.50;
        }
        else {
            total = 0;
            System.out.println("codigo invalido");
        }

        if(total > 0){
            System.out.printf("total: %.2f%n", total);
        }

 


        System.out.println("digite um valor");
        double valor = sc.nextDouble();

        if (valor < 0 || valor > 100){
            System.out.println("fora de intervalo");
        }
        else if(valor <= 25.0){
            System.out.println("intervalo [0 , 25]");
        }
        else if(valor <= 50.0){ 
            System.out.println("intervalo (25,50]");
        }
        else if(valor <= 75.0){
            System.out.println("intervalo (50,75");
        }
        else{
            System.out.println("intervalo 75, 100");
        }


        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x == 0.0 && y == 0.0){
            System.out.println("origem");
        }
        // 2. Verificamos se está sobre o Eixo X (Y é zero, mas X não)
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        // 3. Verificamos se está sobre o Eixo Y (X é zero, mas Y não)
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        // 4. Verificamos os Quadrantes baseados nos sinais (+ ou -)
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            // Se não é nenhum dos anteriores, só pode ser Q4 (x > 0 e y < 0)
            System.out.println("Q4");
        }
       
       
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.0) {
            imposto = 0.0;
        } 
        else if (salario <= 3000.0) {
            // Paga 8% sobre o que exceder 2000
            imposto = (salario - 2000.0) * 0.08;
        } 
        else if (salario <= 4500.0) {
            // Paga 8% sobre os 1000 da segunda faixa + 18% sobre o que exceder 3000
            imposto = (1000.0 * 0.08) + (salario - 3000.0) * 0.18;
        } 
        else {
            // Paga 8% sobre a 2ª faixa + 18% sobre a 3ª faixa + 28% sobre o que exceder 4500
            imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + (salario - 4500.0) * 0.28;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            // %f com .2 para garantir as duas casas decimais
            System.out.printf("R$ %.2f%n", imposto);
        }

 

        // Fecha o Scanner para liberar os recursos de memória (boa prática)
        sc.close();
    }
}
   */

