
import java.util.Scanner;

//Digite un número e indique si es par o impar
/**
 *
 * @author Titi
 */
public class ParImpar {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("INGRESE POR FAVOR UN NUMERO : ");
        int numero = sc.nextInt();
        
        if (numero % 2==0){
            System.out.println("EL NUMERO INGRESADO ES PAR : ");
        } else {
            System.out.println("EL NUMERO INGRESADO ES IMPAR : ");
        }
        
        
        
    }
    
}
