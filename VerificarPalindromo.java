/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Verifica si una palabra es palíndroma utilizando una pila de
caracteres para comparar su versión original e invertida.
---------------------------------------------------------------
*/

package pilas;

import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<Character> pila = new Pila<>();

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // Inserta cada carácter en la pila
        for (char c : palabra.toCharArray()) {
            pila.push(c);
        }

        // Forma la palabra invertida
        String invertida = "";
        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }

        // Compara original e invertida
        if (palabra.equalsIgnoreCase(invertida))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }
}


