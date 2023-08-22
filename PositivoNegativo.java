//1. Digite un número y que imprima si es positivo o negativo
package ejeciciossemana1;

import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESE PORFAVOR UN NUMERO");
        double numero = sc.nextDouble();
        
        if (numero > 0){
            System.out.println("EL NUMERO ES POSITIVO");  
        }if (numero < 0){
        
                System.out.println("EL NUMERO ES NEGATIVO ");
            }
        }
        
    }


