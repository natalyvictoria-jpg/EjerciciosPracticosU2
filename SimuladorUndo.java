/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Simula una función de "deshacer" (UNDO) utilizando una pila que
almacena las acciones realizadas.
---------------------------------------------------------------
*/

package pilas;

import java.util.Scanner;

public class SimuladorUndo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<String> acciones = new Pila<>();

        while (true) {
            System.out.print("Acción (UNDO/FIN): ");
            String act = sc.nextLine();

            if (act.equalsIgnoreCase("FIN")) break; // Termina el programa
            if (act.equalsIgnoreCase("UNDO")) {      // Deshace la última acción
                if (!acciones.isEmpty()) acciones.pop();
            } else {
                acciones.push(act); // Guarda la acción en la pila
            }

            // Muestra las acciones actuales
            System.out.println("Acciones actuales: " + acciones);
        }
    }
}



