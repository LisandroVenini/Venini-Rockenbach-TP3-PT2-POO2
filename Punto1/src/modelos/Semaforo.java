package modelos;

public class Semaforo {
    private Estado estadoActual;

    public Semaforo(Estado estadoInicial) {
        this.estadoActual = estadoInicial;
    }

    /**
     * Establece un nuevo estado para el semáforo.
     * 
     * @param nuevoEstado El nuevo estado que se va a establecer.
     */
    public void setEstado(Estado nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Muestra el estado actual del semáforo y lo cambia al siguiente estado.
     */
    public void mostrarEstado() {
        estadoActual.cambiarEstado(this);
    }
}

