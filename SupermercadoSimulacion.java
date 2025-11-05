package Cola;

import java.util.*;

/**
 * Ejercicio 2: Simulación de supermercado.
 * Modela colas para carritos y cajas, gestionando la llegada y pago de clientes.
 */
public class SupermercadoSimulacion {
    // Cola que guarda los carritos disponibles para los clientes
    private Cola<Integer> carritosDisponibles;
    // Lista de colas, una por cada caja de pago
    private List<Cola<String>> cajas;

    /** 
     * Constructor: inicializa el supermercado con cierto número de carritos y cajas.
     */
    public SupermercadoSimulacion(int numCarritos, int numCajas) {
        this.carritosDisponibles = new Cola<>();
        this.cajas = new ArrayList<>();

        // Llena la cola de carritos disponibles (1 al numCarritos)
        for (int i = 1; i <= numCarritos; i++) {
            carritosDisponibles.encolar(i);
        }

        // Crea las colas de cada caja
        for (int i = 0; i < numCajas; i++) {
            cajas.add(new Cola<>());
        }
    }

    /** Devuelve la cola de carritos disponibles */
    public Cola<Integer> getCarritosDisponibles() {
        return carritosDisponibles;
    }

    /** Devuelve la lista de cajas */
    public List<Cola<String>> getCajas() {
        return cajas;
    }

    /**
     * Un cliente llega y toma un carrito (si hay disponible).
     * Luego se forma en la caja con menos clientes.
     */
    public void clienteLlega(String nombre) {
        if (carritosDisponibles.estaVacia()) {
            System.out.println(nombre + " espera por un carrito...");
            return;
        }

        int carrito = carritosDisponibles.desencolar();

        // Encuentra la caja con menos personas en fila
        Cola<String> cajaMenosLlena = cajas.stream()
                .min(Comparator.comparingInt(Cola::tamaño))
                .orElse(null);

        if (cajaMenosLlena != null) {
            cajaMenosLlena.encolar(nombre);
            System.out.println(nombre + " tomo el carrito #" + carrito + " y se formo en la caja.");
        }
    }

    /**
     * Simula que un cliente paga y devuelve el carrito al sistema.
     */
    public void clientePaga(String nombre) {
        for (Cola<String> caja : cajas) {
            // Busca al cliente al frente de alguna caja
            if (!caja.estaVacia() && caja.frente().equals(nombre)) {
                caja.desencolar(); // Cliente atendido
                carritosDisponibles.encolar(1); // Libera un carrito
                System.out.println(nombre + " ha pagado y libero su carrito.");
                return;
            }
        }
        System.out.println(nombre + " no esta en el frente de ninguna caja.");
    }
}

