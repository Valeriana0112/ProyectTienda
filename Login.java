import java.util.HashMap;
import java.util.Map;

public class Login {
    private static final Map<String, String> usuarios = new HashMap<>();
    static {
        usuarios.put("claudia", "030405");
        usuarios.put("Josue", "090102");
        usuarios.put("Angello", "010203");
        usuarios.put("Erick", "123456");
    }

    public static boolean autenticar(String usuario, String contraseña) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña);
    }

    public static void agregarUsuario(String usuario, String contraseña) {
        usuarios.put(usuario, contraseña);

    }
}