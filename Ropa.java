public class Ropa {
    private String vendedor;
    private String comprador;
    private int id;
    private String talla;
    private double precio;

    public Ropa(int id, String talla, double precio) {
        this.id = id;
        this.talla = talla;
        this.precio = precio;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ropa [id=" + id + ", talla=" + talla + ", precio=" + precio + "]";
    }

}