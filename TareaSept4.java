//crea un programa que pida el nombre y me imprima nombre y edad 

package tareasept4;

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class TareaSept4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //pedir informacion al usuario e imprimir 
        System.out.print("ingrese la cantidad de nombres que desea ingresar :");
        // daclarar variables 
        int Num = sc.nextInt();
        sc.nextLine();
        
         //arreglos 
        String[] nombres = new String[Num];
        int[] edad = new int[Num];
        
          // crear el bucle para nombre , la edad e imprimir 
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("nombre " + (i + 1) + ":");
            nombres[i] = sc.nextLine();

            System.out.print("edad" + (i + 1) + ":");
            edad[i] = Integer.parseInt(sc.nextLine());

        }
        
        // me muesta los nombres ingresados y sus edades 
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("los nombres ingresados fueron : " + nombres[i] + " y tienen " + edad[i] + " años de edad ");

        }

    }

}
