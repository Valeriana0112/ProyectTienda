class ItemCarrito {
    private Prenda prenda;
    private int cantidad;

    public ItemCarrito(Prenda prenda, int cantidad) {
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return prenda.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "ItemCarrito [prenda=" + prenda + ", cantidad=" + cantidad + "]";
    }
}