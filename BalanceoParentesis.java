/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Verifica si una expresión tiene paréntesis correctamente balanceados
usando una pila de caracteres.
---------------------------------------------------------------
*/

package pilas;

public class BalanceoParentesis {

    public static boolean estaBalanceada(String expr) {
        Pila<Character> pila = new Pila<>();

        for (char c : expr.toCharArray()) {
            if (c == '(') pila.push(c);
            else if (c == ')') {
                if (pila.isEmpty()) return false;
                pila.pop();
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(estaBalanceada("((2+3)*5)"));  // true
        System.out.println(estaBalanceada("((2+3)*5"));   // false
    }
}

