import java.util.Scanner;

//11. Diseñe un programa que calcule el índice de masa corporal de una persona 
//(IMC = peso [kg] /altura2 [m]) e indique el estado en el que se encuentra esa 
//persona en función del valor de IMC

/**
 *
 * @author Titi
 */
public class MasaCorporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su Indice de Masa Corporal es: " + imc);

        if (imc < 18.5) {
            System.out.println("Está bajo de peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Su peso es normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tiene sobrepeso.");
        } else {
            System.out.println("Tiene obesidad.");
        }

    }
}





   
