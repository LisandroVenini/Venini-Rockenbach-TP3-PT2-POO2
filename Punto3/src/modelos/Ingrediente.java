package modelos;

public class Ingrediente implements Pizza{
    private Pizza pizzaTerminada;

    public Ingrediente(Pizza pizzaTerminada) {
        this.pizzaTerminada = pizzaTerminada;
    }

    /**
     * Devuelve la descripcion de la pizza 
     * 
     * @return la descripcion de la pizza
     * 
     */
    @Override
    public String getDescripcion() {
        return pizzaTerminada.getDescripcion();
    }

    /**
     * Calcula el costo total de la pizza incluyendo todos los ingredientes agregados.
     * 
     * @return el costo de la pizza
     */
    @Override
    public double getCosto() {
        return pizzaTerminada.getCosto();
    }

}
