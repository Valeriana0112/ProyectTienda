import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ropa2 {
    private List<Ropa> inventario;

    public Ropa2() {
        this.inventario = new ArrayList<>();
    }

    public void agregarRopa(Ropa ropa) {
        inventario.add(ropa);
    }

    public void listarRopa() {
        if (inventario.isEmpty()) {
            System.out.println("No hay ropa en el inventario.");
        } else {
            for (Ropa ropa : inventario) {
                System.out.println(ropa);
            }
        }
    }
}

    