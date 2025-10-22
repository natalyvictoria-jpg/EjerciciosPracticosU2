/*
Actividad: Ejercicios Prácticos – Listas
Tema: Lista Enlazada de Palabras desde Archivo
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

import java.io.*;
import java.util.Scanner;

// Actividad 02: Lista Enlazada de Palabras desde Archivo
// Autor: [Tu nombre]

public class ListaPalabras {
    private NodoPalabra cabeza;

    public ListaPalabras() {
        cabeza = null;
    }

    public void insertarAlFinal(String palabra) {
        NodoPalabra nuevo = new NodoPalabra(palabra);
        if (cabeza == null) cabeza = nuevo;
        else {
            NodoPalabra actual = cabeza;
            while (actual.siguiente != null)
                actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        NodoPalabra actual = cabeza;
        System.out.println("\nContenido de la lista:");
        while (actual != null) {
            System.out.print(actual.palabra + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void eliminar(String palabra) {
        while (cabeza != null && cabeza.palabra.equalsIgnoreCase(palabra))
            cabeza = cabeza.siguiente;

        NodoPalabra actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.palabra.equalsIgnoreCase(palabra))
                actual.siguiente = actual.siguiente.siguiente;
            else
                actual = actual.siguiente;
        }
    }

    public void leerArchivo(String nombreArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] palabras = linea.split("\\s+");
            for (String p : palabras)
                if (!p.isEmpty()) insertarAlFinal(p);
        }
        br.close();
    }

    public void escribirArchivo(String nombreArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
        NodoPalabra actual = cabeza;
        while (actual != null) {
            bw.write(actual.palabra + " ");
            actual = actual.siguiente;
        }
        bw.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaPalabras lista = new ListaPalabras();

        try {
            System.out.print("Nombre del archivo (ej: palabras.txt): ");
            String archivo = sc.nextLine();
            lista.leerArchivo(archivo);
            lista.mostrar();

            System.out.print("Añadir palabra: ");
            lista.insertarAlFinal(sc.nextLine());
            lista.mostrar();

            System.out.print("Eliminar palabra: ");
            lista.eliminar(sc.nextLine());
            lista.mostrar();

            lista.escribirArchivo(archivo);
            System.out.println("Archivo actualizado correctamente.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


