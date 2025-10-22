/*
Clase NodoDoble para lista doblemente enlazada de caracteres
Actividad: Ejercicios Prácticos – Listas
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

// Nodo de lista doblemente enlazada
public class NodoDoble {
    char caracter;
    NodoDoble anterior;
    NodoDoble siguiente;

    public NodoDoble(char c) {
        caracter = c;
        anterior = null;
        siguiente = null;
    }
}


