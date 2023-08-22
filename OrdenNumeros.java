import java.util.Scanner;

//6. Digite tres números e imprima si están en orden creciente, en orden 
//decreciente o no aumenta ni disminuye el orden.

/**
 *
 * @author Titi
 */
public class OrdenNumeros {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
        
        if (num1 < num2 && num2 < num3) {
            System.out.println("Los números están en orden creciente.");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Los números están en orden decreciente.");
        } else {
            System.out.println("Los números no siguen un patrón de orden.");
        }
        
        
}
}
