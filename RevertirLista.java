/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Usa una pila para invertir el contenido de una lista de números
enteros y mostrarlos en orden inverso.
---------------------------------------------------------------
*/

package pilas;

public class RevertirLista {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4};
        Pila<Integer> pila = new Pila<>();

        for (int n : lista) pila.push(n);

        System.out.print("Lista invertida: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");
        }
    }
}

