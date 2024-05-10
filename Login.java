public class Login {
    
    public static final String USUARIO_CORRECTO = "claudia";
    public static final String CONTRASEÑA_CORRECTA = "030405";

    
    public static boolean verificarCredenciales(String usuario, String contraseña) {
        return usuario.equals(USUARIO_CORRECTO) && contraseña.equals(CONTRASEÑA_CORRECTA);
    }
}