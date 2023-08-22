import java.util.Scanner;

//16. Diseñe un programa que lea la temperatura e imprima el tipo de clima de 
//acuerdo con lo dado

/**
 *
 * @author Titi
 */
public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 0) {
            System.out.println("El clima es frío extremo.");
        } else if (temperatura >= 0 && temperatura < 10) {
            System.out.println("El dia estara frío.");
        } else if (temperatura >= 10 && temperatura < 20) {
            System.out.println("El dia estara nublado.");
        } else if (temperatura >= 20 && temperatura < 30) {
            System.out.println("El dia estara caluroso.");
        } else {
            System.out.println("Sera un dia tropical .");
        }

     
    }
}
    

