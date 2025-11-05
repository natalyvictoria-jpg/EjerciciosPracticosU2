/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Invierte una palabra ingresada por el usuario utilizando una pila
de caracteres.
---------------------------------------------------------------
*/

package pilas;

import java.util.Scanner;

public class InvertirPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<Character> pila = new Pila<>();

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        for (char c : palabra.toCharArray()) {
            pila.push(c);
        }

        System.out.print("Palabra invertida: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
    }
}

