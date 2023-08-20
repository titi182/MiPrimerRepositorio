// 4) Realiza un programa para encontrar la raíz cuadra de 10.

package raiz;

import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        // Declarar variables
        Scanner nuevo = new Scanner(System.in);

        // Pedir datos
        System.out.println("Ingrese un numero ");
        int numero = nuevo.nextInt();

        // Proceso
        double raiz = Math.sqrt(numero);

        System.out.println("La raiz cuadrada del numero " + numero + " es: " + raiz);
    }
}

