import java.util.Scanner;

//10. Digitar una letra e imprima si está en mayúscula o minúscula
/**
 *
 * @author Titi
 */
public class Mayusculas {
    public static void main(String[] args) {
        Scanner may = new Scanner(System.in);
        
        System.out.print("Ingrese una letra: ");
        char letra = may.next().charAt(0);
        
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra está en mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra está en minúscula.");
        } else {
            System.out.println("Ingrese un caracte valido.");
        }
        
     
    }
}
