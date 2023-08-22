//4. Ingrese un número y que imprima cuantas cifras tiene
import java.util.Scanner;



/**
 *
 * @author Titi
 */
public class CuantasCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("INGRESA UN NUMERO: ");
        int numero = scanner.nextInt();
        
        int cantidadCifras = contarCifras(numero);
        
        System.out.println("El número tiene " + cantidadCifras + " cifras.");
        
        
    }
    
    // Función para contar las cifras de un número
   public static int contarCifras(int num) {
        if (num == 0) {
            return 1;  // El caso especial cuando el número es 0
        }
        
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
    
