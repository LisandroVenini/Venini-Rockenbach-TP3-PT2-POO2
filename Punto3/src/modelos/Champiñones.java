package modelos;

public class Champiñones extends Ingrediente {
    
    public Champiñones(Pizza pizza) {
        super(pizza);
    }

    /**
     * Agrega "Champiñones" a la descripcion de la pizza.
     * 
     * @return la descripcion de la pizza con champiñones
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Champiñones";
    }    
    /**
     * Agrega un costo adicional de 2.0 a la pizza.
     * 
     * @return el costo de la pizza con champiñones
     */
    @Override
    public double getCosto() {
        return super.getCosto() + 2.0; // Costo adicional de los champiñones
    }
    
}
