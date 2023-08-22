import java.util.Scanner;

//13. Ingresar una nota de 0 al 10 y mostrar si es, insuficiente, suficiente, bien, 
//notable o sobresaliente
/**
 *
 * @author Titi
 */
public class IngresarNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa una nota de 0 a 10 : ");
        double nota = sc.nextDouble();
        
        if (nota >= 0 && nota < 5) {
            System.out.println("Su nota es insuficiente.");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Su nota es suficiente.");
        } else if (nota >= 6 && nota < 8) {
            System.out.println("Su nota esta bien.");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("S nota es notable.");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Su  nota es sobresaliente.");
        } else {
            System.out.println("Ingrese una nota válida.");
        }
        
        
    }
}
    

