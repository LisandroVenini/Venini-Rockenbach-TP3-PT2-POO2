package modelos;

public class Jamon extends Ingrediente {
    
    public Jamon(Pizza pizza) {
        super(pizza);
    }
    /**
     * Agrega "Jamon" a la descripcion de la pizza.
     * 
     * @return la descripcion de la pizza con Jamon
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Jamón";
    }

    /**
     * Agrega un costo adicional de 2.0 a la pizza.
     * 
     * @return el costo de la pizza con Jamon
     */
    @Override
    public double getCosto() {
        return super.getCosto() + 2.0; // Costo adicional del jamón
    }
    
}
