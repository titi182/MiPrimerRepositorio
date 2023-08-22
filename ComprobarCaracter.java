import java.util.Scanner;

//19. . Comprobar si un carácter es un dígito, una letra mayúscula o una
//letra minúscula
/**
 *
 * @author Titi
 */
public class ComprobarCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = sc.next().charAt(0);

        if (Character.isDigit(caracter)) {
            System.out.println("El carácter es un dígito.");
        } else if (Character.isUpperCase(caracter)) {
            System.out.println("El carácter es una letra mayúscula.");
        } else if (Character.isLowerCase(caracter)) {
            System.out.println("El carácter es una letra minúscula.");
        } else {
            System.out.println("El carácter no es un dígito ni una letra.");
        }

        
    }
    
}
