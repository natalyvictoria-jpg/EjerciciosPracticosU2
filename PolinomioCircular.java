/*
Actividad: Ejercicios Prácticos – Listas
Tema: Polinomio con Lista Circular
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

import java.util.Scanner;

// Actividad 04: Polinomio con Lista Circular

public class PolinomioCircular {
    private NodoCircular ultimo;

    public PolinomioCircular() {
        ultimo = null;
    }

    public void insertar(double c, int e) {
        NodoCircular nuevo = new NodoCircular(c, e);
        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public void mostrar() {
        if (ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }
        NodoCircular actual = ultimo.siguiente;
        System.out.println("Polinomio:");
        do {
            System.out.print(actual.coeficiente + "x^" + actual.exponente + " ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolinomioCircular poli = new PolinomioCircular();

        System.out.println("Introduce términos del polinomio (coeficiente 0 para terminar):");
        while (true) {
            System.out.print("Coeficiente: ");
            double c = sc.nextDouble();
            if (c == 0) break;
            System.out.print("Exponente: ");
            int e = sc.nextInt();
            poli.insertar(c, e);
        }

        poli.mostrar();
    }
}

