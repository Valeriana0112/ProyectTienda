class PayPay {
    public static String procesarPago(double total) {
        // Aquí se simula el procesamiento del pago
        // En un sistema real, esta lógica se reemplazaría con la integración de un
        // servicio de pago real
        if (total > 0) {
            return "Pago exitoso. Total: $" + total;
        } else {
            return "El total a pagar debe ser mayor que cero.";
        }
    }
}