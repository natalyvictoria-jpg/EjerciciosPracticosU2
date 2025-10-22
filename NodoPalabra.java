/*
Clase NodoPalabra para lista enlazada de palabras
Actividad: Ejercicios Prácticos – Listas
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

// Nodo para lista de palabras
public class NodoPalabra {
    String palabra;
    NodoPalabra siguiente;

    public NodoPalabra(String palabra) {
        this.palabra = palabra;
        this.siguiente = null;
    }
}

