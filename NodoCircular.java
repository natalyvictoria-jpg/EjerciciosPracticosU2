/*
Clase NodoCircular para lista circular de polinomios
Actividad: Ejercicios Prácticos – Listas
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

// Nodo para lista circular de polinomios
public class NodoCircular {
    double coeficiente;
    int exponente;
    NodoCircular siguiente;

    public NodoCircular(double c, int e) {
        coeficiente = c;
        exponente = e;
        siguiente = null;
    }
}


