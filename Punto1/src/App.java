import modelos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Semaforo semaforo = new Semaforo(new Rojo());
        
        for (int i=0;i<3; i++) {
            semaforo.mostrarEstado();
        }
    }
}
