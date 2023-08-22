import java.util.Scanner;

//17. Digite un numero entre 1 a 12 e imprima el número de días que tiene el mes 
//correspondido

/**
 *
 * @author Titi
 */
public class Meses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 12 : ");
        int numeroMes = sc.nextInt();

        int dias;

        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;  // Suponiendo un año no bisiesto
                break;
            default:
                System.out.println("Número de mes no válido.");
                
                return;
        }

        System.out.println("El mes " + numeroMes + " tiene " + dias + " días.");

        
    }
}
    
