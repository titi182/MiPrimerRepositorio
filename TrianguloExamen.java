//calcular el area de un triangulo dada su base y altura 
package trianguloexamen;


import javax.swing.JOptionPane;

public class TrianguloExamen {
    public static void main(String[] args) {
       
        String baseStr = JOptionPane.showInputDialog("Ingrese la base del triángulo:");
        double base = Double.parseDouble(baseStr);

       
        String alturaStr = JOptionPane.showInputDialog("Ingrese la altura del triángulo:");
        double altura = Double.parseDouble(alturaStr);

        
        double area = (base * altura) / 2;

        
        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
    }
}
