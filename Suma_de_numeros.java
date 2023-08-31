//Realice un programa que lea 10 números y luego los sume
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class Suma_de_numeros {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        //declaracion de variables para almacenar las suma 
        int suma = 0;

        //leer y sumar los numeros 
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ":");
            int numero = num.nextInt();
            //sumar el numero ingresado a la suma total 
            suma += numero;
        }

        System.out.println("la suma de los 10 numeros es : " + suma);

    }
}
