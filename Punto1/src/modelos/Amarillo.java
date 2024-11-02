package modelos;

class Amarillo implements Estado {
/**
 * Metodo que cambia el estado del semaforo
 * 
 * @param semaforo El semaforo al que se le va a cambiar el estado
 */
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Luz Amarilla");
        // Cambiar al siguiente estado (Verde)
        semaforo.setEstado(new Verde());
    }
}

