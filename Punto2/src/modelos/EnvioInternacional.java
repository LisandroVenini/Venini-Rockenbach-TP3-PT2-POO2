package modelos;

public class EnvioInternacional implements EnvioStrategy {
    /**
     * Calcula el costo de envío según el peso del paquete.
     *
     * La tarifa de envío internacional es de 20.0 por kilogramo.
     *
     * @param peso el peso del paquete en kilogramos
     * @return el costo de envío en la moneda local
     */
    @Override
    public double calcularCosto(double peso) {
        return peso * 20.0;
    }


    /**
     * Devuelve el tiempo de entrega en días para un envío internacional.
     * 
     * El tiempo de entrega para un envío internacional es de 10 días.
     *
     * @return el tiempo de entrega en días
     */
    @Override
    public int tiempoEntrega() {
        return 10;
    }
}
