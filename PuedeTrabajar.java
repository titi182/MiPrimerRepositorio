import java.util.Scanner;

//18. Ingresar el nombre, edad, salario y muestra del salario
//Si es menor de 17 años, no puede trabajar


/**
 *
 * @author Titi
 */
public class PuedeTrabajar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su salario: ");
        double salario = sc.nextDouble();

        if (edad >= 17) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Salario: $" + salario);
        } else {
            System.out.println("Lo siento,usted es menor de edad no deberia trabajar valla estudie .");
        }

        
    }
}

