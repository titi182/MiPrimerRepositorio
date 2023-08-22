//3. Digite un número y que muestre si es múltiplo de 8
import java.util.Scanner;
/**
 *
 * @author Titi
 */
public class Multiplo8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("INGRESE UN NUMERO POR FAVOR: ");
       int numero = sc.nextInt();
       
        if (numero % 8==0){
            System.out.println("EL NUMERO " +numero+ " ES MULTIPLO DE 8");
        } else {
            System.out.println("EL NUMERO " +numero+" NO ES MULTIPLO DE 8");
        }
       
    }
    
}
