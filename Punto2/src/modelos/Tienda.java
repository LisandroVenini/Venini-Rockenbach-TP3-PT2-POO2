package modelos;

public class Tienda {
    private EnvioStrategy tipoEnvio;

    /**
     * Asigna una estrategia de envío.
     * 
     * @param tipoEnvio la estrategia de envío a asignar
     */
    public void setEstrategia(EnvioStrategy tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    /**
     * Procesa el envío de un paquete con un peso determinado.
     * 
     * @param peso el peso del paquete a enviar
     */
    public void procesarEnvio(double peso) {
        double costo = tipoEnvio.calcularCosto(peso);
        int tiempoEntrega = tipoEnvio.tiempoEntrega();

        System.out.println("Costo del envio: $" + costo);
        System.out.println("Tiempo de entrega: " + tiempoEntrega + " dias");
    }
}

