class Usuario {
    private String nombre;
    private CarritoCompras carrito;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.carrito = new CarritoCompras();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CarritoCompras getCarrito() {
        return carrito;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", carrito=" + carrito + "]";
    }
}
