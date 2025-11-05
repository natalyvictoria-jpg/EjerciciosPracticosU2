/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Colas

Descripcion:
Clase principal que ejecuta las simulaciones de los ejercicios:
comparacion de colas, simulacion de supermercado y atencion de
clientes. Sirve como punto de entrada del programa.
---------------------------------------------------------------
*/
package Cola;

/**
 * Clase principal que ejecuta los tres ejercicios de colas.
 */
public class Main {
    public static void main(String[] args) {

        // 🧩 Ejercicio 1: Comparación de colas
        Cola<Integer> cola1 = new Cola<>();
        Cola<Integer> cola2 = new Cola<>();
        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(3);

        cola2.encolar(1);
        cola2.encolar(2);
        cola2.encolar(3);

        System.out.println("¿Colas identicas?: " + ComparadorDeColas.sonIdenticas(cola1, cola2));

        // 🛒 Ejercicio 2: Simulación de supermercado
        SupermercadoSimulacion supermercado = new SupermercadoSimulacion(25, 3);
        supermercado.clienteLlega("Ana");
        supermercado.clienteLlega("Luis");
        supermercado.clientePaga("Ana");

        // 🕒 Ejercicio 3: Simulación de atención al cliente
        SimulacionAtencionClientes simulacion = new SimulacionAtencionClientes();
        simulacion.simular();
    }
}


