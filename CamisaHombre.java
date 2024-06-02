public class CamisaHombre extends RopaHombre {
    public CamisaHombre(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public String toString() {
        return "Camisa de Hombre: " + super.toString();
    }
}
