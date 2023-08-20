//3) Realice un programa que se le den el número total de horas, nos retorne el número de semanas, días, horas equivalentes.

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Titi
 */
public class SemanasDiasHoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //declarar variables 
        int  TotalHoras = 0  , semanas, dias, horas ;
        
        //pedir datos 
         TotalHoras  = Integer.parseInt (JOptionPane.showInputDialog("Digite el numero de horas "));
         
        
        //procero
        semanas = TotalHoras / 168;
        dias = TotalHoras%168 / 24;
        horas = TotalHoras%24;
        
        //mostrar en pantalla
        JOptionPane.showMessageDialog(null,"EL EQUIVALENTE ES : " +"\n"+
                "SEMANAS " +semanas +"\n"+ 
                "DIAS "+dias +"\n"+
                "HORAS "+horas);
        
       
        
    
    }
    
}
