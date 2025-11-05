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

public class PilasBasica {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);

        pila.pop();
        pila.pop();

        System.out.println("Contenido actual de la pila: " + pila);
    }
}

