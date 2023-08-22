import java.util.Scanner;

//12 Digitar dos numeros y decir si es multipli del otro
/**
 *
 * @author Titi
 */
public class MultiplosEntreSi {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Los números no son múltiplos entre sí.");
        }
        
      
    }
}
    
    