package modelos;

public class EnvioExpreso implements EnvioStrategy{
    /**
     * Calcula el costo de envío según el peso del paquete.
     * 
     * La tarifa de envío expreso es de 10.0 por kilogramo.
     *
     * @param peso el peso del paquete en kilogramos
     * @return el costo de envío en la moneda local
     */
    @Override
    public double calcularCosto(double peso) {
        return peso * 10.0;
    }


    /**
     * Devuelve el tiempo de entrega en días para un envío expreso.
     *
     * El tiempo de entrega para un envío expreso es de 2 días.
     *
     * @return el tiempo de entrega en días
     */
    @Override
    public int tiempoEntrega() {
        return 2;
    }
}
