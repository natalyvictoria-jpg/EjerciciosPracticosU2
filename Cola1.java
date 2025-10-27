/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 *
 * @author Victoria
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();

        // 🔹 Tareas iniciales
        cola.add("Preparar cafe");
        cola.add("Revisar correos");
        cola.add("Llamar al cliente");

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n===== MENU DE COLA =====");
            System.out.println("1. Mostrar todas las tareas");
            System.out.println("2. Agregar nueva tarea");
            System.out.println("3. Consultar la primera tarea o consultar frente");
            System.out.println("4. Eliminar la primera tarea");
            System.out.println("5. Mostrar tamano de la cola");
            System.out.println("6. Vaciar la cola"); // NUEVA OPCIÓN
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar salto
            } else {
                System.out.println(" Ingresa un número valido.");
                sc.nextLine();
                continue;
            }

            if (opcion == 1) {
                if (cola.isEmpty()) {
                    System.out.println("️ No hay tareas en la cola.");
                } else {
                    System.out.println(" Tareas actuales:");
                    for (String t : cola) {
                        System.out.println("- " + t);
                    }
                }
            } 
            else if (opcion == 2) {
                System.out.print("️ Escribe la nueva tarea: ");
                String nueva = sc.nextLine();
                cola.add(nueva);
                System.out.println(" Tarea agregada correctamente.");
            } 
            else if (opcion == 3) {
                if (cola.isEmpty()) {
                    System.out.println("️ La cola esta vacia.");
                } else {
                    System.out.println(" Primera tarea: " + cola.peek());
                }
            } 
            else if (opcion == 4) {
                if (cola.isEmpty()) {
                    System.out.println("️ No hay tareas para eliminar.");
                } else {
                    String eliminada = cola.poll();
                    System.out.println(" Tarea eliminada: " + eliminada);
                }
            } 
            else if (opcion == 5) {
                System.out.println(" Tamano actual de la cola: " + cola.size());
            }
            else if (opcion == 6) { // NUEVO BLOQUE PARA VACIAR COLA
                if (cola.isEmpty()) {
                    System.out.println("️ La cola ya está vacía.");
                } else {
                    cola.clear();
                    System.out.println("✅ Todas las tareas han sido eliminadas. La cola está vacía.");
                }
            }
            else if (opcion == 0) {
                System.out.println("👋 Saliendo del programa...");
            } 
            else {
                System.out.println(" Opcion no valida. Intenta de nuevo.");
            }
        }

        sc.close();
    }
}

