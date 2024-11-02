package modelos;

class Verde implements Estado {
/**
 * Metodo que cambia el estado del semaforo 
 * 
 * @param semaforo El semaforo al que se le va a cambiar el estado
*/
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Luz Verde");
        // Cambiar al siguiente estado (Rojo)
        semaforo.setEstado(new Rojo());
    }
}
