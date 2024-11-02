import modelos.Champiñones;
import modelos.Jamon;
import modelos.Pizza;
import modelos.PizzaBasica;
import modelos.QuesoExtra;

public class App {
        /**
         * Programa principal.
         *
         * En este programa se ilustra el patrón Decorator. Se crea una pizza básica
         * y se le van agregando ingredientes utilizando las clases QuesoExtra,
         * Jamon y Champiñones. Luego se imprimen los ingredientes y el costo de
         * cada pizza.
         */
    public static void main(String[] args) throws Exception {
        Pizza pizza = new PizzaBasica();
        System.out.println(pizza.getDescripcion() + " -> $" + pizza.getCosto());

        // Añadir queso extra
        pizza = new QuesoExtra(pizza);
        System.out.println(pizza.getDescripcion() + " -> $" + pizza.getCosto());

        // Añadir jamón
        pizza = new Jamon(pizza);
        System.out.println(pizza.getDescripcion() + " -> $" + pizza.getCosto());

        // Añadir champiñones
        pizza = new Champiñones(pizza);
        System.out.println(pizza.getDescripcion() + " -> $" + pizza.getCosto());
    }
}
