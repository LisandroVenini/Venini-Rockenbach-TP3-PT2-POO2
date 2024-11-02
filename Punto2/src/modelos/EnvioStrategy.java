package modelos;

// Interfaz EnvioStrategy
interface EnvioStrategy {
    double calcularCosto(double peso);
    int tiempoEntrega();         
}

