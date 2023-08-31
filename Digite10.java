//6. Realice un programa que digite 10 números y los imprima en el siguiente orden:
//-El primero
//-El ultimo
//-El segundo
//-El penúltimo
//-El tercero
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class Digite10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[11];

        // Pedir al usuario que ingrese 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }

        // Imprimir los números en el orden especificado
        System.out.println("El primero: " + numeros[0]);
        System.out.println("El último: " + numeros[10]);
        System.out.println("El segundo: " + numeros[3]);
        System.out.println("El penúltimo: " + numeros[9]);
        System.out.println("El tercero: " + numeros[2]);
    }

}
