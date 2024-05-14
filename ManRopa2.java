import java.util.Scanner;

public class ManRopa2 {
    public static void main(String[] args) {
        Scanner ro = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de prendas de ropa que quiera vende:");
        int cantidadPrendas = ro.nextInt();

        Ropa[] prendas = new Ropa[cantidadPrendas];

        for (int i = 0; i < cantidadPrendas; i++) {
            System.out.println("\nIngrese los detalles de la prenda " + (i + 1) + ":");
            System.out.println("ID:");
            int id = ro.nextInt();
            System.out.println("Talla:");
            String talla = ro.next();
            System.out.println("Precio:");
            double precio = ro.nextDouble();

            prendas[i] = new Ropa(id, talla, precio);
        }

        System.out.println("\nPrendas de ropa ingresadas:");
        for (Ropa prenda : prendas) {
            System.out.println(prenda.toString());
        }

        ro.close();
    }
}