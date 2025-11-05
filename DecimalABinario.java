/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Convierte un número decimal a binario utilizando una pila para
almacenar los restos de las divisiones sucesivas.
---------------------------------------------------------------
*/

package pilas;

import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<Integer> pila = new Pila<>();

        System.out.print("Ingrese un numero decimal: ");
        int num = sc.nextInt();

        while (num > 0) {
            pila.push(num % 2);
            num /= 2;
        }

        System.out.print("Binario: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
    }
}
