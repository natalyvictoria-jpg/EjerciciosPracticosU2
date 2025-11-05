/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Comprueba si una pila está vacía antes y después de insertar un
elemento, usando el método isEmpty().
---------------------------------------------------------------
*/

package pilas;

public class VerificarPilaVacia {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        // Verifica si la pila está vacía antes de agregar elementos
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());

        pila.push(1); // Agrega un elemento
        System.out.println("¿Está vacía la pila? " + pila.isEmpty()); // Verifica nuevamente
    }
}



