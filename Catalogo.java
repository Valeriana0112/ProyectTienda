import java.util.ArrayList;

class Catalogo {
    private ArrayList<Prenda> prendas;
    private int proximoId;

    public Catalogo() {
        this.prendas = new ArrayList<>();
        this.proximoId = 1; // Comienza en 1
    }

    public void agregarPrenda(Prenda prenda) {
        prenda.setId(proximoId); // Asigna el próximo ID a la prenda
        prendas.add(prenda);
        proximoId++; // Incrementa el contador para el próximo ID
    }

    public void eliminarPrenda(int id) {
        for (int i = 0; i < prendas.size(); i++) {
            if (prendas.get(i).getId() == id) {
                prendas.remove(i);
                return;
            }
        }
        System.out.println("No se encontró ninguna prenda con el ID especificado.");
    }

    public void actualizarPrenda(int id, Prenda nuevaPrenda) {
        for (int i = 0; i < prendas.size(); i++) {
            if (prendas.get(i).getId() == id) {
                prendas.set(i, nuevaPrenda);
                System.out.println("Prenda actualizada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ninguna prenda con el ID especificado. La prenda no se ha actualizado.");
    }

    public ArrayList<Prenda> getPrendas() {
        return prendas;
    }

    public void eliminarPrenda(Prenda prenda) {
        prendas.remove(prenda);
    }

    @Override
    public String toString() {
        return "Catalogo [prendas=" + prendas + "]";
    }
}
