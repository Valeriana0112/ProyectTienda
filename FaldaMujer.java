public class FaldaMujer extends RopaMujer {
    public FaldaMujer(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public String toString() {
        return "Falda de Mujer: " + super.toString();
    }
}
