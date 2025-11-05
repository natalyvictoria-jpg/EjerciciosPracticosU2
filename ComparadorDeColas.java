/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo: Q GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Colas

Descripcion:
Contiene un metodo generico para comparar dos colas y determinar
si son identicas, considerando el tamaño y el orden de sus elementos.
Se usa para practicar el recorrido y comparacion de estructuras FIFO.
---------------------------------------------------------------
*/

package Cola;

/**
 * Ejercicio 1: Compara dos colas genéricas.
 * Si ambas tienen el mismo tamaño y los mismos elementos en el mismo orden, retorna true.
 */
public class ComparadorDeColas {

    /**
     * Compara dos colas del mismo tipo.
     * @param cola1 primera cola
     * @param cola2 segunda cola
     * @return true si son idénticas, false en caso contrario.
     */
    public static <T> boolean sonIdenticas(Cola<T> cola1, Cola<T> cola2) {
        // Si los tamaños son distintos, no pueden ser iguales
        if (cola1.tamaño() != cola2.tamaño()) return false;

        // Se obtienen copias de los elementos para no alterar las colas originales
        var lista1 = cola1.getElementos();
        var lista2 = cola2.getElementos();

        // Se comparan elemento por elemento
        for (int i = 0; i < lista1.size(); i++) {
            if (!lista1.get(i).equals(lista2.get(i))) {
                return false; // Si un elemento difiere, no son idénticas
            }
        }
        return true; // Si todos coinciden, las colas son iguales
    }
}


