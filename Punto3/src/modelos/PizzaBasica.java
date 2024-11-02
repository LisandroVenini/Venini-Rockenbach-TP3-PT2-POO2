package modelos;

public class PizzaBasica implements Pizza{
    
    @Override
    public String getDescripcion() {
        return "Pizza Básica";
    }

    @Override
    public double getCosto() {
        return 5.0; // Precio base de la pizza
    }
}
