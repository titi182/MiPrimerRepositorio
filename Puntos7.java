/*Crea un arreglo de números de 50 posiciones, que contendrá los números del 1
al 50. Obtén la suma de todos ellos y la media.
 */

/**
 *
 * @author Titi
 */
public class Puntos7 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int  suma = 0;
        for (int i = 0; i < 50; i++) {
           
            numeros[i] = i+1;
            suma += numeros[i];           
        }
        int media= suma/50;
        System.out.println("la suma de los numeros del 1 al 50 es  " +suma+" \n y su media es " +media  );
    }
    
}
