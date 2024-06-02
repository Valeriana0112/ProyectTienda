public class MetodoPago {
    private String tipo;

    public MetodoPago(String tipo) {
        this.tipo = tipo;
    }

    public String procesarPago(double monto) {
        // Aquí podrías agregar la lógica para procesar el pago según el método de pago
        return "Pago procesado exitosamente por " + tipo + " por un monto de $" + monto;
    }
}