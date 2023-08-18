
import java.util.Scanner;

/**
 *
 * @author Titi
 */
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
               
        String  nombre, password , nombre2 , password2;
        nombre = "titi";
        password = "0987";
                      
        System.out.println("ingrese su nombre : ");
         nombre2 = sc.nextLine();
        System.out.println("ingrese su password : ");
         password2 = sc.nextLine();
        
         if (password2 .equals(password)&& nombre2.equals(nombre)){
             System.out.println("BIENVENIDO");
         }
             
         else if (nombre2 .equals(nombre )){
                 System.out.println("INGRESE UNA PASSWORD VALIDA ");
                                  }
         else if (password2 .equals(password)){
                 System.out.println("INGRESE UN USUARIO VALIDO ");
                 }
         
       else{
                     System.out.println("USUARIO INCORRECTO");
                     }
    
    }
}
