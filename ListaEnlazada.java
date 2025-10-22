/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

import java.util.Random;
import java.util.Scanner;

// Actividad 01: Manipulación de Lista Enlazada Simple
// Autor: [Tu nombre]

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void insertarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null)
            cabeza = nuevo;
        else {
            Nodo actual = cabeza;
            while (actual.siguiente != null)
                actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        System.out.print("Elementos de la lista: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void eliminarMayoresQue(int limite) {
        while (cabeza != null && cabeza.dato > limite)
            cabeza = cabeza.siguiente;

        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato > limite)
                actual.siguiente = actual.siguiente.siguiente;
            else
                actual = actual.siguiente;
        }
    }

    public void generarListaAleatoria(int cantidad) {
        Random r = new Random();
        for (int i = 0; i < cantidad; i++)
            insertarAlFinal(r.nextInt(100) + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("=== Actividad 01: Lista Enlazada Simple ===");
        System.out.print("¿Cuántos números deseas generar? ");
        int n = sc.nextInt();

        lista.generarListaAleatoria(n);
        lista.mostrarLista();

        System.out.print("Ingresa un valor límite: ");
        int limite = sc.nextInt();

        lista.eliminarMayoresQue(limite);
        lista.mostrarLista();
    }
}
