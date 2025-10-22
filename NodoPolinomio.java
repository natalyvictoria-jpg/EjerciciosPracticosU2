/*
Clase NodoPolinomio para representar un término de un polinomio
Actividad: Ejercicios Prácticos – Listas
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

// Nodo para representar un término de un polinomio
public class NodoPolinomio {
    double coeficiente;
    int exponente;
    NodoPolinomio siguiente;

    public NodoPolinomio(double c, int e) {
        coeficiente = c;
        exponente = e;
        siguiente = null;
    }
}
