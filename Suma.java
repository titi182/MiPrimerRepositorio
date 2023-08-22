import java.util.Scanner;

//8. Digite dos números, los sume y muestre el resultado
/**
 *
 * @author Titi
 */
public class Suma {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma es: " + suma);
        
        
    }
}
