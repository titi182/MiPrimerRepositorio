import java.util.Scanner;
/**
 *
 * @author Titi
 */
public class Fiebre {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);        
        double grados;
              
        System.out.println("cuantos grados tiene ");
            grados = sc.nextDouble();
            
            if (grados  <= 35){
            System.out.println("esta bien");
            }
            else if (grados >=36 && grados<=40){
                System.out.println("vaya al medico");
            }
            else if (grados >40) {
                    System.out.println("pague la funeraria");
                    }
            
    }
    
}

