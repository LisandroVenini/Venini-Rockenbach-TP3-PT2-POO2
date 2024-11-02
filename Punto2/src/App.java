import modelos.EnvioExpreso;
import modelos.EnvioInternacional;
import modelos.EnvioRegular;
import modelos.Tienda;

public class App {
    public static void main(String[] args) throws Exception {
        Tienda tienda = new Tienda();
        double pesoProducto = 2.5;

        tienda.setEstrategia(new EnvioRegular());
        System.out.println("Envío Regular:");
        tienda.procesarEnvio(pesoProducto);

        // Envío Expreso
        tienda.setEstrategia(new EnvioExpreso());
        System.out.println("\nEnvío Expreso:");
        tienda.procesarEnvio(pesoProducto);

        // Envío Internacional
        tienda.setEstrategia(new EnvioInternacional());
        System.out.println("\nEnvío Internacional:");
        tienda.procesarEnvio(pesoProducto);
    }}
