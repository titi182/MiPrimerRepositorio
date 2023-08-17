
import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class Bienvenido {

    private static String String;
    public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
         
         //declarar variables 
         
         String nombre;
         int edad;
         
         System.out.println("Por favor ingrese su nombre : ");       
         System.out.println("");
         System.out.println("Por favor ingrese su edad: ");
         edad = Scanner.nextInt();
         
         //mostrar resultado 
         
         System.out.println("Bienvenid@  " +nombre);
         
         
         
        
    }
    
}
