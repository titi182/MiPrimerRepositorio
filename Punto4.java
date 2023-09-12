
import java.util.Scanner;

/*Usando la lógica anterior programa imprima únicamente los numero que sea
negativo. 
 */

/**
 *
 * @author Titi
 */
public class Punto4 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese 5 numeros ");
              numeros[i] = sc.nextInt();
                      
        }
         System.out.println("los numero negativos son :");
        for (int i = 0; i < 5; i++) {
            if (numeros[i ]<=0){               
            System.out.println(numeros[i] );
            
        }

    
        }

        }
    
}
