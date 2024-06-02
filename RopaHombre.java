class RopaHombre extends Prenda {
    public RopaHombre(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public String toString() {
        return "Ropa de Hombre: " + super.toString();
    }
}