/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Clase generica que implementa la estructura de datos Pila (Stack),
permitiendo almacenar y manipular elementos de cualquier tipo.
Incluye operaciones basicas como push, pop, peek y verificacion de
si la pila esta vacia. Se utiliza como base para los demas ejercicios.
---------------------------------------------------------------
*/

package pilas;

import java.util.ArrayList;

public class Pila<T> {

    // Lista interna que almacena los elementos de la pila
    private ArrayList<T> elementos;

    // Constructor que inicializa una pila vacía
    public Pila() {
        elementos = new ArrayList<>();
    }

    // Inserta un elemento en la parte superior de la pila
    public void push(T elemento) {
        elementos.add(elemento);
    }

    // Elimina y devuelve el elemento superior de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía. No se puede desapilar.");
        }
        return elementos.remove(elementos.size() - 1);
    }

    // Devuelve el elemento superior sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía. No se puede consultar.");
        }
        return elementos.get(elementos.size() - 1);
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    // Devuelve el número de elementos en la pila
    public int size() {
        return elementos.size();
    }

    // Devuelve el contenido de la pila como cadena de texto
    @Override
    public String toString() {
        return elementos.toString();
    }
}
