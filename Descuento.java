import java.util.Scanner;

//15. En </u>coltisTechnology se hace un descuento del 20% de descuento a los 
//clientes cuya
//compra supere los 300. ¿Cuál sería el valor para pagar por su compra?
/**
 *
 * @author Titi
 */
public class Descuento {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = sc.nextDouble();
        
        double montoPagar ;
        
        
         if (montoCompra > 300) {
            // Cálculo de descuento
            double descuento = 0.20 * montoCompra;
            // Restamos el descuento para obtener el resultado
            montoPagar = montoCompra - descuento;
        } else {
            // No hay descuento
            montoPagar = montoCompra;
            System.out.println("Su compra no tiene descuento ");
        }

        System.out.println("El total a pagar es: " + montoPagar);

        
    }
}

