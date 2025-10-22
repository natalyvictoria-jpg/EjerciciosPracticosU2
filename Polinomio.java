/*
Actividad: Ejercicios Prácticos – Listas
Tema: Representación y Evaluación de Polinomios
* @author Nataly Victoria Gonzalez Aviles. GTID141
Fecha: 21/10/2025
 */
package EjerciciosPracticos;

import java.util.Scanner;

// Actividad 03: Representación y Evaluación de Polinomios

public class Polinomio {
    private NodoPolinomio cabeza;

    public Polinomio() {
        cabeza = null;
    }

    public void insertarTermino(double c, int e) {
        NodoPolinomio nuevo = new NodoPolinomio(c, e);
        if (cabeza == null) cabeza = nuevo;
        else {
            NodoPolinomio actual = cabeza;
            while (actual.siguiente != null)
                actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    public double evaluar(double x) {
        double resultado = 0;
        NodoPolinomio actual = cabeza;
        while (actual != null) {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        }
        return resultado;
    }

    public void mostrarTablaValores() {
        System.out.println("\nx\tP(x)");
        System.out.println("---------------");
        for (double x = 0.0; x <= 5.0; x += 0.5)
            System.out.printf("%.1f\t%.2f\n", x, evaluar(x));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polinomio poli = new Polinomio();

        System.out.println("Introduce los términos (coeficiente exponente). Usa coeficiente 0 para terminar:");
        while (true) {
            System.out.print("Coeficiente: ");
            double c = sc.nextDouble();
            if (c == 0) break;
            System.out.print("Exponente: ");
            int e = sc.nextInt();
            poli.insertarTermino(c, e);
        }

        poli.mostrarTablaValores();
    }
}

