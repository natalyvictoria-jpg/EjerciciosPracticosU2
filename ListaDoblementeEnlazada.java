/*
Actividad: Ejercicios Prácticos – Listas
Tema: Lista Doblemente Enlazada de Caracteres
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

import java.util.Scanner;

// Actividad 05: Lista Doblemente Enlazada de Caracteres

public class ListaDoblementeEnlazada {
    private NodoDoble cabeza;

    public void insertarFinal(char c) {
        NodoDoble nuevo = new NodoDoble(c);
        if (cabeza == null)
            cabeza = nuevo;
        else {
            NodoDoble actual = cabeza;
            while (actual.siguiente != null)
                actual = actual.siguiente;
            actual.siguiente = nuevo;
            nuevo.anterior = actual;
        }
    }

    public void ordenar() {
        if (cabeza == null) return;
        boolean intercambio;
        do {
            intercambio = false;
            NodoDoble actual = cabeza;
            while (actual.siguiente != null) {
                if (actual.caracter > actual.siguiente.caracter) {
                    char temp = actual.caracter;
                    actual.caracter = actual.siguiente.caracter;
                    actual.siguiente.caracter = temp;
                    intercambio = true;
                }
                actual = actual.siguiente;
            }
        } while (intercambio);
    }

    public void mostrar() {
        NodoDoble actual = cabeza;
        System.out.print("Lista ordenada: ");
        while (actual != null) {
            System.out.print(actual.caracter + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

        for (char c : texto.toCharArray())
            lista.insertarFinal(c);

        lista.ordenar();
        lista.mostrar();
    }
}



