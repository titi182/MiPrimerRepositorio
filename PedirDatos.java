
import java.util.Scanner;


/**
 *
 * @author Titi
 */
public class PedirDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //declarar variables 
        
        int numero1, numero2, suma , resta , multiplicacion, divicion;
       
        
        System.out.println("ingrese un numero");
        numero1 = teclado.nextInt();
        System.out.println("ingrese otro numero");
        numero2 = teclado.nextInt();
        
        //proceso
        
        suma  = numero1 + numero2 ;
        resta = numero1 - numero2 ;
        multiplicacion = numero1 * numero2 ;
        divicion = numero1 / numero2 ;
        
        // mostrar resultado 
        
        System.out.println("el resultado de la suma  es : "+suma);
        System.out.println("el resultado de la resta  es : "+resta);
        System.out.println("el resultado de la multiplicacion es : "+multiplicacion);
        System.out.println("el resultado de la divicion es : "+divicion);
        
                
    }
}
