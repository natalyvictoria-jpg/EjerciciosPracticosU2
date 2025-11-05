/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Permite ingresar nombres y mostrarlos en orden inverso utilizando
una pila de tipo String.
---------------------------------------------------------------
*/

package pilas;

import java.util.Scanner;

public class PilaDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<String> pila = new Pila<>();
        String nombre;

        // Solicita nombres al usuario hasta que ingrese "FIN"
        while (true) {
            System.out.print("Ingrese un nombre (FIN para salir): ");
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("FIN")) break; // Sale del ciclo
            pila.push(nombre); // Agrega el nombre a la pila
        }

        // Imprime los nombres en orden inverso (LIFO)
        System.out.println("Nombres en orden inverso:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}



