
import java.util.Scanner;

//5. Digite tres números e imprima si todos los números son iguales, todos los 
//numero son diferentes o Ninguno de los dos es igual o diferente
/**
 *
 * @author Titi
 */
public class SonIguales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        int num1 = sc.nextInt();
        
         System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        int num2 = sc.nextInt();
        
         System.out.println("INGRESE EL TERCER NUMERO: ");
        int num3 = sc.nextInt();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("TODOS LOS NUMERON SON IGUALES ");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("TODOS LOS NUMEROS SON DIFERENTES ");
        } else if (num1 == num2 && num2 != num3){            
           System.out.println("SOLO HAY DOS CONINCIDENCIAS ");
        }else if (num1 == num3 && num3 != num2){            
           System.out.println("SOLO HAY DOS CONINCIDENCIAS ");
        }else if (num2 == num3 && num3 != num1){            
           System.out.println("SOLO HAY DOS CONINCIDENCIAS ");
        }
        
        else {
            System.out.println("NINGUNO DE LOS NUMEROS ES IGUAL O DIFERENTE ");
        }

    }

}
