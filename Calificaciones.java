//1) hacer un programa que calcule e improma la suma de cuatro calificaciones 

import javax.swing.JOptionPane;

/**
 *
 * @author Titi
 */
public class Calificaciones {
    public static void main(String[] args) {
        //declara variables 
        
        double calif1,calif2,calif3,calif4,suma,promedio ;
        
        
        //pedir datos 
        calif1 = Double.parseDouble (JOptionPane.showInputDialog("escrina la primera calificacion"));
        calif2 = Double.parseDouble (JOptionPane.showInputDialog("escrina la segunda calificacion"));
        calif3 = Double.parseDouble (JOptionPane.showInputDialog("escrina la tersera calificacion"));
        calif4 = Double.parseDouble (JOptionPane.showInputDialog("escrina la cuarta calificacion"));
        
        // proceso
        
        suma = calif1 + calif2 + calif3 + calif4;
        promedio = suma/4 ;
        
        // mostrar en pantalla 
        JOptionPane.showMessageDialog(null, "LA SUMA DE LAS CALIFICACIONES ES: "+suma +"\n"+ "EL PROMEDIO ES: " +promedio );
                
        
       
        
        
        
       
    }
}
