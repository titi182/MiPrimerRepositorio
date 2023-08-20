
import java.util.Scanner;
import javax.swing.JOptionPane;

//5) Realiza un programa que permita elevar un numero a la potencia.
/**
 *
 * @author Titi
 */
public class ElevarPotencia {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un mumero: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingresa el exponente: ");
        int exponente = sc.nextInt();

        double resultado = calcularPotencia(n1, exponente);
        System.out.println(n1 + " elevado a la potencia " + exponente + " es igual a " + resultado);

        
    }

    public static double calcularPotencia(double n1, int exponente) {
        double resultado = 1.0;

        for (int i = 1; i <= exponente; i++) {
            resultado *= n1;
        }
        return resultado;
    }
}
