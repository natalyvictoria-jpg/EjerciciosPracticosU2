package Cola;

import java.util.LinkedList;

/**
 * Clase genérica que implementa una cola (FIFO: First In - First Out).
 * Se usa para modelar estructuras como filas de clientes o carritos disponibles.
 */
public class Cola<T> {
    // Lista enlazada que almacena los elementos de la cola
    private LinkedList<T> elementos;

    /** Constructor: inicializa la cola vacía */
    public Cola() {
        this.elementos = new LinkedList<>();
    }

    /** 
     * Agrega un elemento al final de la cola.
     * @param elemento el valor que se desea agregar
     */
    public void encolar(T elemento) {
        elementos.addLast(elemento);
    }

    /** 
     * Elimina y devuelve el primer elemento de la cola.
     * Si la cola está vacía, retorna null.
     */
    public T desencolar() {
        if (estaVacia()) return null;
        return elementos.removeFirst();
    }

    /** 
     * Devuelve el primer elemento sin eliminarlo.
     * @return el elemento del frente de la cola o null si está vacía.
     */
    public T frente() {
        if (estaVacia()) return null;
        return elementos.getFirst();
    }

    /** 
     * Verifica si la cola está vacía.
     * @return true si no tiene elementos, false en caso contrario.
     */
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    /** 
     * Devuelve el tamaño actual de la cola.
     * @return número de elementos en la cola.
     */
    public int tamaño() {
        return elementos.size();
    }

    /** 
     * Retorna una copia de los elementos actuales para no alterar el original.
     */
    public LinkedList<T> getElementos() {
        return new LinkedList<>(elementos);
    }

    /** 
     * Permite reemplazar los elementos de la cola (no se usa normalmente).
     */
    public void setElementos(LinkedList<T> nuevosElementos) {
        this.elementos = new LinkedList<>(nuevosElementos);
    }
}

