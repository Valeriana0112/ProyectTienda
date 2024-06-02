public class BlusaMujer extends RopaMujer {
    public BlusaMujer(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public String toString() {
        return "Blusa de Mujer: " + super.toString();
    }
}
