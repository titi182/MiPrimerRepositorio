
import java.util.Scanner;

/* Usando la lógica anterior programa imprima los números de forma inversa.
 */

/**
 *
 * @author Titi
 */
public class Punto2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese 5 numeros ");
              numeros[i] = sc.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(" #  " +(i+1)+"  es :" +numeros[i]);
            
        }

    }
        
    }
         
    

