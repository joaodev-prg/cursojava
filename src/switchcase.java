
import java.util.Scanner;
public class switchcase {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            String dia;

        switch (x){
        
        case 1 :
            dia = "domingo";
            break;    
        
        case 2:
            dia = "segunda";
            break;
        case 3 :
            dia = "terça";
            break;
        case 4 :
            dia = "quarta";
            break;
        case 5 :
            dia = "quinta";
            break;
        case 6 :
            dia = "sexta";  
            break;
        case 7 :
            dia = "sabado";         
            break;
        default:            
            dia = "valor invalido";
            break;
            }  
            System.out.println(dia);
        }
    }
}
