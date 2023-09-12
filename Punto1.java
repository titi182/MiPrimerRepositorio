/*Cree un arreglo numérico con 5 elementos. Los números de cada elemento
deben corresponder al valor deseado por el usuario del teclado. Muestra el
índice y su valor correspondiente en la consola. Debe usar bucles tanto para
consultar los valores de los elementos del arreglo como para mostrar su
contenido en la pantalla.
 */
import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese 5 numeros ");
              numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(" #  " +(i+1)+"  es :" +numeros[i]);
            
        }

    }

}
