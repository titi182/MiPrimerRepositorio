//2) pablo tiene x cantidad de dinero, jose tiene el doble de lo que tiene pablo , miguel tiene la mita de lo que tiene jose y pablo juntos
//realice un programa para saber cuanto dinero tiene cada uno 
import javax.swing.JOptionPane;

/**
 *
 * @author Titi
 */
public class Pablo {
    public static void main(String[] args) {
        
        //decalrar variables         
        double pablo, jose , migel ;
        
        //pedir datos 
        pablo = Double.parseDouble (JOptionPane.showInputDialog("cuanto dinero tiene pablo"));
        
        //proceso
         pablo = pablo;
         jose = pablo *2;
         migel = (pablo+jose)/2;
         
         //mostran en pantalla
         JOptionPane.showMessageDialog(null,"Pablo tiene: $" + pablo +"\n"+ "Jose tiene: $" + jose +"\n"+ "Miguel tiene: $" + migel);
        
       
         
         
        
    }
}
