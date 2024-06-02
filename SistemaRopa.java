import java.util.*;

class SistemaRopa {
    private Catalogo catalogoHombre;
    private Catalogo catalogoMujer;
    private ArrayList<Usuario> usuarios;

    public SistemaRopa() {
        this.catalogoHombre = new Catalogo();
        this.catalogoMujer = new Catalogo();
        this.usuarios = new ArrayList<>();
    }

    public Catalogo getCatalogoHombre() {
        return catalogoHombre;
    }

    public Catalogo getCatalogoMujer() {
        return catalogoMujer;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public String toString() {
        return "SistemaRopa [catalogoHombre=" + catalogoHombre + ", catalogoMujer=" + catalogoMujer + ", usuarios="
                + usuarios + "]";
    }
}