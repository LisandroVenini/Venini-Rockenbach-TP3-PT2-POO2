package modelos;

public class QuesoExtra extends Ingrediente{
    
    public QuesoExtra(Pizza pizza) {
        super(pizza);
    }

    /**
     * Agrega "Queso Extra" a la descripcion de la pizza.
     * 
     * @return la descripcion de la pizza con queso extra
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Queso Extra";
    }

    /**
     * Agrega un costo adicional de 2.0 a la pizza.
     * 
     * @return el costo de la pizza con queso extra
     */
    @Override
    public double getCosto() {
        return super.getCosto() + 2.0; // Costo adicional del queso extra
    }
}
