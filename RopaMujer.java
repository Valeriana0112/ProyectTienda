class RopaMujer extends Prenda {
    public RopaMujer(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public String toString() {
        return "Ropa de Mujer: " + super.toString();
    }
}