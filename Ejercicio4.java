//digitar un numero y mostrar su cuadrado , el programa se detendra cuando se dijite un numero negativo
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        System.out.println("Igrese un numero ");
         int num = sc.nextInt();       
         
        while (num >= 1 ) {
            int oper= num*num;
            System.out.println("el resultado es "+oper);
            num = sc.nextInt();  
              
            
          
            
    }
}
}

