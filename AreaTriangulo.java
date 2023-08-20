
//8) Haz un programa que calcule el área de un triángulo.


import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class AreaTriangulo {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INGRESE LA LONGUITUD DE TRIANGULO: ");
        double base = sc.nextDouble();

        System.out.print("INGRESA LA ALTURA DEL TRIANGULO: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("EL AREA DEL TRIANGULO ES: " + area);

        
    }
}





        
   
    

