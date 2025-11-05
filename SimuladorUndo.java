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
            System.out.print("Accion (UNDO/FIN): ");
            String act = sc.nextLine();

            if (act.equalsIgnoreCase("FIN")) break;
            if (act.equalsIgnoreCase("UNDO")) {
                if (!acciones.isEmpty()) acciones.pop();
            } else {
                acciones.push(act);
            }
            System.out.println("Acciones actuales: " + acciones);
        }
    }
}

