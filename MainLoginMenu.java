import java.io.IOException;
import java.util.Scanner;

public class MainLoginMenu {

    public static void main(String[] args) throws IOException, InterruptedException {

        String USUARIO_CORRECTO = "claudia";
        String CONTRASEÑA_CORRECTA = "030405";

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario:");
        String usuario = reader.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = reader.nextLine();

        if (usuario.equals(USUARIO_CORRECTO) && contraseña.equals(CONTRASEÑA_CORRECTA)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido a la tienda, " + usuario + "!");
            mostrarMenu(); // Llamamos a la función para mostrar el menú
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos. Saliendo del sistema...");
        }
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú de Gestión de Ropa ===");
            System.out.println("1. Agregar prenda");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Realizar venta");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarPrenda();
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    realizarVenta();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema... Espere por favor");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void agregarPrenda() {
        System.out.println("Agregando prenda...");
    }

    public static void mostrarInventario() {
        System.out.println("Mostrando inventario...");
    }

    public static void realizarVenta() {
        System.out.println("Realizando venta...");
    }
}