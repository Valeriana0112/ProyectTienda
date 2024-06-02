class PantalonHombre extends RopaHombre {
    public PantalonHombre(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public String toString() {
        return "Pantalón de Hombre: " + super.toString();
    }
}
