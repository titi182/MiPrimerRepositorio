//Realice un programa que muestre la tabla de multiplicar
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class Tabla_de {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //imprimir mensaje 
        System.out.print("Ingrese el numero de la tabla que desea : ");
        int num = sc.nextInt();
        
        System.out.println("Tabla de multiplicar del " + num + ":");
        
        for (int i = 1; i <= 10; i++){
            int resul = num * i ;
            System.out.println(num + " x " + i + " = " + resul);
        }
        

    }

}
