// Realice un programa que dibuje un cuadrado utilizando *
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class Asterisco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
        int lado = scanner.nextInt();

        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

}
