import java.util.Scanner;

public class MainLogin {

    public static void main(String[] args) {
        
        String USUARIO_CORRECTO = "claudia";
        String CONTRASEÑA_CORRECTA = "030405";

        
        Scanner reader = new Scanner(System.in);

        
        System.out.println("Ingrese su nombre de usuario:");
        String usuario = reader.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = reader.nextLine();

        
        while (!usuario.equals(USUARIO_CORRECTO) || !contraseña.equals(CONTRASEÑA_CORRECTA)) {
            System.out.println("Nombre de usuario o contraseña incorrectos. Inténtelo de nuevo.");

            
            System.out.println("Ingrese su nombre de usuario:");
            usuario = reader.nextLine();
            System.out.println("Ingrese su contraseña:");
            contraseña = reader.nextLine();
        }

        
        System.out.println("Inicio de sesión exitoso. ¡Bienvenido a la tienda, " + usuario + "!");
    }
}