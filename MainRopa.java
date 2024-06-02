import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRopa {
    private static Scanner scanner = new Scanner(System.in);
    private static SistemaRopa sistema = new SistemaRopa();

    public static void main(String[] args) {
        Login.agregarUsuario("claudia", "030405");
        Login.agregarUsuario("Jouse", "090102");
        Login.agregarUsuario("Angello", "010203");
        Login.agregarUsuario("Erick", "123456");
        while (true) {
            limpiarConsola(); // Limpiar la consola al iniciar
            if (realizarLogin()) {
                mostrarMenuPrincipal();
            } else {
                System.out.println("Usuario o contraseña incorrectos. Saliendo del sistema.");
                break;
            }
        }
    }

    private static boolean realizarLogin() {
        boolean loginExitoso = false;
        do {
            System.out.print("Ingrese su usuario: ");
            String usuario = scanner.next();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = scanner.next();
            if (Login.autenticar(usuario, contraseña)) {
                loginExitoso = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
                limpiarConsola(); // Limpiar la consola en caso de error de inicio de sesión
            }
        } while (!loginExitoso);
        return loginExitoso;
    }

    private static void mostrarMenuPrincipal() {
        int opcion = 0;
        Usuario usuario = obtenerUsuario(); // Llamar una vez fuera del bucle
        do {
            limpiarConsola(); // Limpiar la consola al mostrar el menú principal
            try {
                System.out.println("\n ____ _____ ______ _   ___      ________ _   _ _____ _____   ____  _ \r\n" + //
                        "|  _ \\_   _|  ____| \\ | \\ \\    / /  ____| \\ | |_   _|  __ \\ / __ \\| |\r\n" + //
                        "| |_) || | | |__  |  \\| |\\ \\  / /| |__  |  \\| | | | | |  | | |  | | |\r\n" + //
                        "|  _ < | | |  __| | . ` | \\ \\/ / |  __| | . ` | | | | |  | | |  | | |\r\n" + //
                        "| |_) || |_| |____| |\\  |  \\  /  | |____| |\\  |_| |_| |__| | |__| |_|\r\n" + //
                        "|____/_____|______|_| \\_|   \\/   |______|_| \\_|_____|_____/ \\____/(_)\r\n" + //
                        "                                                                     \r\n" + //
                        "             _                 _______ _____ ______ _   _ _____          \r\n" + //
                        "    /\\      | |        /\\     |__   __|_   _|  ____| \\ | |  __ \\   /\\    \r\n" + //
                        "   /  \\     | |       /  \\       | |    | | | |__  |  \\| | |  | | /  \\   \r\n" + //
                        "  / /\\ \\    | |      / /\\ \\      | |    | | |  __| | . ` | |  | |/ /\\ \\  \r\n" + //
                        " / ____ \\   | |____ / ____ \\     | |   _| |_| |____| |\\  | |__| / ____ \\ \r\n" + //
                        "/_/    \\_\\  |______/_/    \\_\\    |_|  |_____|______|_| \\_|_____/_/    \\_\\\r\n" + //
                        "                                                                        ");
                System.out.println("            ██████       \r\n" + //
                        "           ████████      \r\n" + //
                        "           ████████      \r\n" + //
                        "            ██████       \r\n" + //
                        "        ██████████████   \r\n" + //
                        "       █████████████ ██  \r\n" + //
                        "       ██ ██████████ ██  \r\n" + //
                        "       ██ ██████████ ██  \r\n" + //
                        "       ██ ██████████ ██  \r\n" + //
                        "       ██ ██████████ ██  \r\n" + //
                        "       ██ ██████████ ██  \r\n" + //
                        "       ██ ██████████ ██  \r\n" + //
                        "       ██ ██████████ ██  \r\n" + //
                        "          ████  ████     \r\n" + //
                        "          ████  ████     \r\n" + //
                        "          ████  ████     \r\n" + //
                        "          ████  ████     \r\n" + //
                        "          ████  ████     \r\n" + //
                        "          ████  ████     \r\n" + //
                        "          ████  ████     \r\n" + //
                        "              " + //
                        "                       ");
                System.out.println("     Catálogo de Hombre. Presione 1");
                System.out.println("             ██████         \r\n" + //
                        "            ████████        \r\n" + //
                        "            ████████        \r\n" + //
                        "              ████        \r\n" + //
                        "         ██████████████     \r\n" + //
                        "        ████████████████    \r\n" + //
                        "       ██████████████████   \r\n" + //
                        "      ████████████████████    \r\n" + //
                        "      ██  ████████████  ██  \r\n" + //
                        "      ██  ████████████  ██ \r\n" + //
                        "      ██  ████████████  ██ \r\n" + //
                        "      ██  ████████████  ██\r\n" + //
                        "          ████████████    \r\n" + //
                        "        ████████████████   \r\n" + //
                        "       ██████████████████   \r\n" + //
                        "     ██████████████████████    \r\n" + //
                        "            █████████       \r\n" + //
                        "            ████ ████       \r\n" + //
                        "            ████ ████       \r\n" + //
                        "            ████ ████       \r\n" + //
                        "            ████ ████       \r\n" + //
                        "            ████ ████       \r\n" + //
                        "            ████ ████      \r\n" + //
                        "          ");
                System.out.println("     Catálogo de Mujer. Presione 2");
                System.out.println("                               \r\n" + //
                        "██████                         \r\n" + //
                        "     ██                        \r\n" + //
                        "     ██                        \r\n" + //
                        "      █████████████████████████\r\n" + //
                        "      ██    ██    ██    ██   ██\r\n" + //
                        "       ██    █    ██   ██    █ \r\n" + //
                        "       ███████████████████████ \r\n" + //
                        "        ██   ██   ██   ██   ██ \r\n" + //
                        "        ██   ██   ██   ██  ██  \r\n" + //
                        "        █████████████████████  \r\n" + //
                        "      █████████████████████    \r\n" + //
                        "      ██                       \r\n" + //
                        "        ████████████████████   \r\n" + //
                        "          ██   █      █   ██   \r\n" + //
                        "           █████      █████    \r\n" + //
                        "                               ");
                System.out.println("     Carrito de Compras. Presione 3");
                System.out.println("          ███  █████              \r\n" + //
                        "        █████████ ████            \r\n" + //
                        "      ████ ████  ████             \r\n" + //
                        "     ███  ███  ████     ██████    \r\n" + //
                        "     ███████ ████   ██████████    \r\n" + //
                        "      ████ ████     ███    ███    \r\n" + //
                        "    ████ █████████████████████    \r\n" + //
                        "    █████████              ███    \r\n" + //
                        "     ████████  ██  ██  ███ ███    \r\n" + //
                        "          ███ ███  ██  ███ ███    \r\n" + //
                        "          ███ ███  ██  ███ ███    \r\n" + //
                        "          ███ ███  ██  ███ ███    \r\n" + //
                        "          ███ ███  ██  ███ ███    \r\n" + //
                        "          ███ ███  ██  ███ ███    \r\n" + //
                        "          ███ ███  ██  ███ ███    \r\n" + //
                        "          ███  ██  ██   ██ ███    \r\n" + //
                        "          ████             ███    \r\n" + //
                        "            █████████████████     ");
                System.out.println("     Agregar/Actualizar/Eliminar mis prendas. Presione 4");
                System.out.println("                                        \r\n" + //
                        "                ████████                \r\n" + //
                        "        ████████████   ██               \r\n" + //
                        "       ████       ██ ████████           \r\n" + //
                        "       ███         █████     ███        \r\n" + //
                        "       ███   ████████████     ███       \r\n" + //
                        "      ████  █████████████    █████      \r\n" + //
                        "     ██████████████████████████████     \r\n" + //
                        "     █        ██        ██        █     \r\n" + //
                        "    ██       ████      ████       ██    \r\n" + //
                        "    ██        ██        ██        ██    \r\n" + //
                        "    ██        ██        ██        ██    \r\n" + //
                        "    ██         █        █         ██    \r\n" + //
                        "    ██          ██    ██          ██    \r\n" + //
                        "    ██            ████            ██    \r\n" + //
                        "    ██                            ██    \r\n" + //
                        "    ██                            ██    \r\n" + //
                        "    ██                            ██    \r\n" + //
                        "    ██                            ██    \r\n" + //
                        "    █                              █    \r\n" + //
                        "    █████████████████████████████████   \r\n" + //
                        "                                        ");
                System.out.println("     Procesar Pago. Presione 5");
                System.out.println("                                        \r\n" + //
                        "                                        \r\n" + //
                        "  ███████████████████████████           \r\n" + //
                        "  █████████████           ███           \r\n" + //
                        "  ███      ████████       ███           \r\n" + //
                        "  ███            ███      ███           \r\n" + //
                        "  ███            ███      ███           \r\n" + //
                        "  ███            ███      ███  ██       \r\n" + //
                        "  ███            ███           ████     \r\n" + //
                        "  ███            ███             ████   \r\n" + //
                        "  ███            ███   ███████████████  \r\n" + //
                        "  ███            ███            ████    \r\n" + //
                        "  ███            ███           ███      \r\n" + //
                        "  ███            ███      ███           \r\n" + //
                        "  ███            ███      ███           \r\n" + //
                        "  ███            ███      ███           \r\n" + //
                        "  ███            ███      ███           \r\n" + //
                        "  █████          ████████████           \r\n" + //
                        "    ████████████████                    \r\n" + //
                        "             ███████                    \r\n" + //
                        "                                        ");
                System.out.println("     Presione 6 para salir");
                System.out.print("     Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        mostrarCatalogo(sistema.getCatalogoHombre(), usuario);
                        break;
                    case 2:
                        mostrarCatalogo(sistema.getCatalogoMujer(), usuario);
                        break;
                    case 3:
                        mostrarCarritoCompras(usuario);
                        break;
                    case 4:
                        gestionarPrendasUsuario(usuario);
                        break;
                    case 5:
                        procesarPago(usuario);
                        break;
                    case 6:
                        System.out.println("Volviendo al login...");
                        return; // Salir del método y volver al inicio de sesión
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (true); // Bucle infinito, la salida se controla por el retorno en el caso 6
    }

    private static void mostrarCatalogo(Catalogo catalogo, Usuario usuario) {
        int opcion = 0;
        do {
            limpiarConsola();
            try {
                System.out.println("\nCatálogo:");
                ArrayList<Prenda> prendas = catalogo.getPrendas();
                int index = 1;
                for (Prenda prenda : prendas) {
                    System.out.println(index++ + ". " + prenda);
                }

                System.out.print("Seleccione una prenda para agregar al carrito (0 para regresar): ");
                opcion = scanner.nextInt();
                if (opcion > 0 && opcion <= prendas.size()) {
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    usuario.getCarrito().agregarItem(prendas.get(opcion - 1), cantidad);
                    System.out.println("Prenda agregada al carrito.");
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    scanner.nextLine(); // Esperar a que el usuario presione Enter
                    return;
                } else if (opcion != 0) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (opcion != 0);
    }

    private static void mostrarCarritoCompras(Usuario usuario) {
        limpiarConsola();
        CarritoCompras carrito = usuario.getCarrito();
        HashMap<Prenda, Integer> items = carrito.getItems();
        System.out.println("\nCarrito de Compras:");
        int index = 1;
        for (Prenda prenda : items.keySet()) {
            System.out.println(index++ + ". " + prenda + " - Cantidad: " + items.get(prenda));
        }
        int opcion = 0;
        do {
            try {
                System.out.println("\nOpciones:");
                System.out.println("1. Agregar producto al carrito");
                System.out.println("2. Eliminar producto del carrito");
                System.out.println("3. Actualizar cantidad de un producto en el carrito");
                System.out.println("4. Regresar");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        mostrarCatalogoParaAgregarAlCarrito(usuario);
                        break;
                    case 2:
                        eliminarProductoDelCarrito(usuario);
                        break;
                    case 3:
                        actualizarCantidadEnCarrito(usuario);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (opcion != 4);
    }

    private static void mostrarCatalogoParaAgregarAlCarrito(Usuario usuario) {
        int opcionCatalogo = 0;
        do {
            limpiarConsola();
            try {
                System.out.println("\nSeleccione un catálogo:");
                System.out.println("1. Catálogo de Hombre");
                System.out.println("2. Catálogo de Mujer");
                System.out.print("Seleccione una opción (0 para regresar): ");
                opcionCatalogo = scanner.nextInt();
                Catalogo catalogoSeleccionado = null;
                switch (opcionCatalogo) {
                    case 1:
                        catalogoSeleccionado = sistema.getCatalogoHombre();
                        break;
                    case 2:
                        catalogoSeleccionado = sistema.getCatalogoMujer();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
                if (catalogoSeleccionado != null) {
                    agregarProductoAlCarrito(catalogoSeleccionado, usuario);
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (opcionCatalogo != 0);
    }

    private static void agregarProductoAlCarrito(Catalogo catalogo, Usuario usuario) {
        int opcion = 0;
        do {
            limpiarConsola();
            try {
                System.out.println("\nCatálogo:");
                ArrayList<Prenda> prendas = catalogo.getPrendas();
                int index = 1;
                for (Prenda prenda : prendas) {
                    System.out.println(index++ + ". " + prenda);
                }

                System.out.print("Seleccione una prenda para agregar al carrito (0 para regresar): ");
                opcion = scanner.nextInt();
                if (opcion > 0 && opcion <= prendas.size()) {
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    usuario.getCarrito().agregarItem(prendas.get(opcion - 1), cantidad);
                    System.out.println("Prenda agregada al carrito.");
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    scanner.nextLine(); // Esperar a que el usuario presione Enter
                    return;
                } else if (opcion != 0) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (opcion != 0);
    }

    private static void eliminarProductoDelCarrito(Usuario usuario) {
        CarritoCompras carrito = usuario.getCarrito();
        HashMap<Prenda, Integer> items = carrito.getItems();
        int opcionEliminar = 0;
        do {
            limpiarConsola();
            System.out.println("\nProductos en el carrito:");
            int index = 1;
            for (Prenda prenda : items.keySet()) {
                System.out.println(index++ + ". " + prenda + " - Cantidad: " + items.get(prenda));
            }
            try {
                System.out.print("Seleccione el número del producto a eliminar (0 para regresar): ");
                opcionEliminar = scanner.nextInt();
                if (opcionEliminar > 0 && opcionEliminar <= items.size()) {
                    ArrayList<Prenda> prendas = new ArrayList<>(items.keySet());
                    carrito.eliminarItem(prendas.get(opcionEliminar - 1));
                    System.out.println("Producto eliminado del carrito.");
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    scanner.nextLine(); // Esperar a que el usuario presione Enter
                    return;
                } else if (opcionEliminar != 0) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (opcionEliminar != 0);
    }

    private static void actualizarCantidadEnCarrito(Usuario usuario) {
        CarritoCompras carrito = usuario.getCarrito();
        HashMap<Prenda, Integer> items = carrito.getItems();
        int opcionActualizar = 0;
        do {
            limpiarConsola();
            System.out.println("\nProductos en el carrito:");
            int index = 1;
            for (Prenda prenda : items.keySet()) {
                System.out.println(index++ + ". " + prenda + " - Cantidad: " + items.get(prenda));
            }
            try {
                System.out.print("Seleccione el número del producto a actualizar (0 para regresar): ");
                opcionActualizar = scanner.nextInt();
                if (opcionActualizar > 0 && opcionActualizar <= items.size()) {
                    ArrayList<Prenda> prendas = new ArrayList<>(items.keySet());
                    Prenda producto = prendas.get(opcionActualizar - 1);
                    System.out.print("Ingrese la nueva cantidad: ");
                    int nuevaCantidad = scanner.nextInt();
                    carrito.actualizarCantidad(producto, nuevaCantidad);
                    System.out.println("Cantidad actualizada en el carrito.");
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    scanner.nextLine(); // Esperar a que el usuario presione Enter
                    return;
                } else if (opcionActualizar != 0) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (opcionActualizar != 0);
    }

    private static void gestionarPrendasUsuario(Usuario usuario) {
        int opcion = 0;
        do {
            limpiarConsola();
            try {
                System.out.println("\nGestionar mis prendas:");
                System.out.println("1. Agregar prenda al catálogo de hombre");
                System.out.println("2. Agregar prenda al catálogo de mujer");
                System.out.println("3. Actualizar prenda del catálogo de hombre");
                System.out.println("4. Actualizar prenda del catálogo de mujer");
                System.out.println("5. Eliminar prenda del catálogo de hombre");
                System.out.println("6. Eliminar prenda del catálogo de mujer");
                System.out.println("7. Regresar");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        agregarRopaCatalogo(sistema.getCatalogoHombre());
                        break;
                    case 2:
                        agregarRopaCatalogo(sistema.getCatalogoMujer());
                        break;
                    case 3:
                        actualizarPrendaCatalogo(sistema.getCatalogoHombre());
                        break;
                    case 4:
                        actualizarPrendaCatalogo(sistema.getCatalogoMujer());
                        break;
                    case 5:
                        eliminarPrendaCatalogo(sistema.getCatalogoHombre());
                        break;
                    case 6:
                        eliminarPrendaCatalogo(sistema.getCatalogoMujer());
                        break;
                    case 7:
                        return;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada inválida
            }
        } while (opcion != 7);
    }

    private static void agregarRopaCatalogo(Catalogo catalogo) {
        limpiarConsola();
        System.out.println("\nAgregar prenda al catálogo:");
        System.out.print("Ingrese el nombre de la prenda: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio de la prenda: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la talla de la prenda: ");
        String talla = scanner.next();
        Prenda prenda = new Prenda(nombre, precio, talla);
        catalogo.agregarPrenda(prenda);
        System.out.println("Prenda agregada correctamente al catálogo.");
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Limpiar el buffer del scanner
        scanner.nextLine(); // Esperar a que el usuario presione Enter
    }

    private static void actualizarPrendaCatalogo(Catalogo catalogo) {
        limpiarConsola();
        System.out.println("\nActualizar prenda en el catálogo:");
        mostrarPrendasCatalogo(catalogo);
        System.out.print("Ingrese el número de la prenda a actualizar (0 para regresar): ");
        int opcionPrenda = scanner.nextInt();
        if (opcionPrenda > 0 && opcionPrenda <= catalogo.getPrendas().size()) {
            Prenda prendaActualizar = catalogo.getPrendas().get(opcionPrenda - 1);
            System.out.print("Ingrese el nuevo nombre de la prenda: ");
            String nuevoNombre = scanner.next();
            System.out.print("Ingrese el nuevo precio de la prenda: ");
            double nuevoPrecio = scanner.nextDouble();
            System.out.print("Ingrese la nueva talla de la prenda: ");
            String nuevaTalla = scanner.next();
            prendaActualizar.setNombre(nuevoNombre);
            prendaActualizar.setPrecio(nuevoPrecio);
            prendaActualizar.setTalla(nuevaTalla);
            System.out.println("Prenda actualizada correctamente.");
        } else if (opcionPrenda != 0) {
            System.out.println("Opción inválida. La prenda no se ha actualizado.");
        }
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Limpiar el buffer del scanner
        scanner.nextLine(); // Esperar a que el usuario presione Enter
    }

    private static void eliminarPrendaCatalogo(Catalogo catalogo) {
        limpiarConsola();
        System.out.println("\nEliminar prenda del catálogo:");
        mostrarPrendasCatalogo(catalogo);
        System.out.print("Ingrese el ID de la prenda a eliminar (0 para regresar): ");
        int idPrenda = scanner.nextInt();

        if (idPrenda != 0) {
            Prenda prendaAEliminar = null;
            for (Prenda prenda : catalogo.getPrendas()) {
                if (prenda.getId() == idPrenda) {
                    prendaAEliminar = prenda;
                    break;
                }
            }

            if (prendaAEliminar != null) {
                catalogo.eliminarPrenda(prendaAEliminar);
                System.out.println("Prenda eliminada del catálogo correctamente.");
            } else {
                System.out.println("No se encontró ninguna prenda con el ID especificado.");
            }
        } else {
            System.out.println("Operación cancelada. No se eliminó ninguna prenda.");
        }

        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Limpiar el buffer del scanner
        scanner.nextLine(); // Esperar a que el usuario presione Enter
    }

    private static void mostrarPrendasCatalogo(Catalogo catalogo) {
        System.out.println("\nCatálogo:");
        ArrayList<Prenda> prendas = catalogo.getPrendas();
        int index = 1;
        for (Prenda prenda : prendas) {
            System.out.println(index++ + ". " + prenda);
        }
    }

    private static void procesarPago(Usuario usuario) {
        limpiarConsola();
        CarritoCompras carrito = usuario.getCarrito();
        double total = carrito.calcularTotal();
        System.out.println("\nProcesar Pago:");
        System.out.println("Total a pagar: $" + total);
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine(); // Limpiar el buffer del scanner
        scanner.nextLine(); // Esperar a que el usuario presione Enter
        carrito.vaciarCarrito();
    }

    private static Usuario obtenerUsuario() {
        // En un sistema real, aquí se obtendría el usuario autenticado
        return new Usuario("John Doe");
    }

    private static void limpiarConsola() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            System.out.println("Error al limpiar la consola: " + e.getMessage());
        }
    }
}
