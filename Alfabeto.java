//Realice un programa que muestre las letras del abecedario (sin la Ñ) en mayúsculas
//y en orden inverso, debe tener encueta que cada fila muestra una letra menos hasta llegar a la A.
package ejerciciosfor;

/**
 *
 * @author Titi
 */
public class Alfabeto {
    public static void main(String[] args) {
        
    
        for ( char letra = 'Z'; letra >= 'A'; letra-- ){
            System.out.println("La letra es " +letra);
    
    }
    
}
}