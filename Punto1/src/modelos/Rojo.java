package modelos;

public class Rojo implements Estado {

    /**
     * Metodo que cambia el estado del semaforo
     * 
     * @param semaforo El semaforo al que se le va a cambiar el estado
     */
    public void cambiarEstado(Semaforo semaforo){
        System.out.println("Luz roja");
        semaforo.setEstado(new Amarillo());
    }

}