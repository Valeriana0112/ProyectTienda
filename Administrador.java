public class Administrador {
    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPrendaAlCatalogo(Catalogo catalogo, Prenda prenda) {
        catalogo.agregarPrenda(prenda);
    }

    public void eliminarPrendaDelCatalogo(Catalogo catalogo, int index) {
        catalogo.eliminarPrenda(index);
    }

    @Override
    public String toString() {
        return "Administrador [nombre=" + nombre + "]";
    }
}
