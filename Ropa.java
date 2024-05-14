public class Ropa {
    private String vendedor;
    private String comprador;
    private String Seccion;
    private String talla;
    private double precio;

    public Ropa(String vendedor, String comprador, String Seccion, String talla, Double precio) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.Seccion = Seccion;
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

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String seccion) {
        Seccion = seccion;
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
        return "Ropa [vendedor=" + vendedor + ", comprador=" + comprador + ", Seccion=" + Seccion + ", talla=" + talla
                + ", precio=" + precio + "]";
    }

}