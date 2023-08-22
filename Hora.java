import java.util.Scanner;

//14. Pedir una hora de la forma hora, minutos y segundos, e imprimir la hora en el 
//segundo siguiente

/**
 *
 * @author Titi
 */
public class Hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese  hora militar : ");
        int hora = sc.nextInt();
        
        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();
        
        System.out.print("Ingrese los segundos: ");
        int segundos = sc.nextInt();
        
        segundos++; 
        
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            
            if (minutos == 60) {
                minutos = 0;
                hora++;
                
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
        
        System.out.println("La hora en el segundo siguiente es: " + hora + ":" + minutos + ":" + segundos);
        
        
    }
}
    

