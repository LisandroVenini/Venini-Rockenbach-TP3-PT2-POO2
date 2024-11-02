package modelos;

public class EnvioRegular implements EnvioStrategy {
    /**
     * Calcula el costo de envío según el peso del paquete.
     *
     * La tarifa de envío internacional es de 5.0 por kilogramo.
     * 
     * @param peso el peso del paquete en kilogramos
     * @return el costo del envío en pesos
     */
    @Override
    public double calcularCosto(double peso) {
        return peso * 5.0;
    }

    /**
     * Devuelve el tiempo de entrega en días para un envío regular.
     *
     * El tiempo de entrega para un envío regular es de 5 días.
     *
     * @return el tiempo de entrega en días
     */
    @Override
    public int tiempoEntrega() {
        return 5;
    }
}
