//6) Realiza un programa que permita redondear un número.

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class RedondiarNumero {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número decimal : ");
        double numero = sc.nextDouble();

        long nRedondeado = Math.round(numero);

        System.out.println("El númeroes: " + nRedondeado);

        
    }
}
    
    

