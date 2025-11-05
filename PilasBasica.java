/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Simula una pila basica realizando operaciones push y pop. Inserta
varios valores enteros, elimina algunos y muestra el contenido final.
---------------------------------------------------------------
*/

package pilas;

public class PilaBasica {
    public static void main(String[] args) {
        // Crea una pila de enteros
        Pila<Integer> pila = new Pila<>();

        // Inserta elementos en la pila
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);

        // Elimina los dos últimos elementos (LIFO)
        pila.pop();
        pila.pop();

        // Muestra el contenido actual de la pila
        System.out.println("Contenido actual de la pila: " + pila);
    }
}



