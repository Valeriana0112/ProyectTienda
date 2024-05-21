import java.util.Scanner;

public class MainLoginMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Contraseña: ");
            String contraseña = sc.nextLine();

            if (Login.verificarCredenciales(usuario, contraseña)) {
                System.out.println("Inicio de sesión exitoso.");

                mostrarMenu();
            } else {
                System.out.println("Credenciales incorrectas. El programa se cerrará.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("El error es" + e);
        }
    }

    public static void mostrarMenu() {
        Scanner op = new Scanner(System.in);
        try {
            int opcion;
            do {
                System.out.println("Bienvenido al Menú de Ropa");
                System.out.println("1. Ver categorías de ropa");
                System.out.println("2. Ver carrito");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = op.nextInt();

                switch (opcion) {
                    case 1:
                        // verCategorias();
                        break;
                    case 2:
                        // verCarrito();
                        break;
                    case 3:
                        System.out.println("Gracias por usar nuestro menú de ropa. ¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            } while (opcion != 3);

            mostrarMenu();
        } catch (Exception e) {
            System.out.println("El error es" + e);

            mostrarMenu();
        } finally {
            op.close();
        }
    }
}