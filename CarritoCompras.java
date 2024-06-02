import java.util.HashMap;

public class CarritoCompras {
    private HashMap<Prenda, Integer> items;

    public CarritoCompras() {
        this.items = new HashMap<>();
    }

    public void agregarItem(Prenda prenda, int cantidad) {
        if (items.containsKey(prenda)) {
            items.put(prenda, items.get(prenda) + cantidad);
        } else {
            items.put(prenda, cantidad);
        }
    }

    public void eliminarItem(Prenda prenda) {
        items.remove(prenda);
    }

    public void actualizarCantidad(Prenda prenda, int nuevaCantidad) {
        if (items.containsKey(prenda)) {
            items.put(prenda, nuevaCantidad);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Prenda prenda : items.keySet()) {
            total += prenda.getPrecio() * items.get(prenda);
        }
        return total;
    }

    public void vaciarCarrito() {
        items.clear();
    }

    public HashMap<Prenda, Integer> getItems() {
        return items;
    }
}