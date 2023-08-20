//7) Realice un programa que permita generar un numero aleatorio


import java.util.Random;

/**
 *
 * @author Titi
 */
public class NumeroAleatorio {

    public static void main(String[] args) {
           
        Random x = new Random();
        // Genera un número aleatorio de tipo int
        int numeroX = x.nextInt();

        System.out.println("NUMERO ALEATORIO : " + numeroX);
    }
}

