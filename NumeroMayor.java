
import java.util.Scanner;

//7. Digite tres números e imprima el número mayor

/**
 *
 * @author Titi
 */
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
        
        int mayor = num1;  
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El número mayor es: " + mayor);
        
        
    }
}
    

