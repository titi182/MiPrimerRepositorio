//Realizar un programa que digite 20numeros e imprima cuantos pares hay, cuantos
//negativos y ceros hay.
package ejerciciosfor;

/**
 *
 * @author Titi
 */
public class Imprimir_par_neg_cero {

    public static void main(String[] args) {

        //declarar variables 
        int pares = 0;
        int negativos = 0;
        int cero = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                pares++;
                
                if (i < 0 ){
                    negativos++;
                    
                    if (i == 0 ){
                        cero++;
                    }
                            
                }
            }
        }
        System.out.println("PARES:"+pares);
        System.out.println("NEGATIVOS:"+negativos);
        System.out.println("CEROS:"+cero);
    }

}
