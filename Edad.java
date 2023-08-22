//9. Digite su edad e imprima si es mayor de edad o menor.
import java.util.Scanner;
/**
 *
 * @author Titi
 */
public class Edad {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
       
    }
}
