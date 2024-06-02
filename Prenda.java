
// Clase Prenda
class Prenda {
    private int id;
    private String nombre;
    private double precio;
    private String talla;

    public Prenda(String nombre, double precio, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Prenda [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", talla=" + talla + "]";
    }

}