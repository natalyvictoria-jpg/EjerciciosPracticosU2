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

    // Método que verifica si los paréntesis están balanceados
    public static boolean estaBalanceada(String expr) {
        Pila<Character> pila = new Pila<>();

        // Recorre cada carácter de la expresión
        for (char c : expr.toCharArray()) {
            if (c == '(') pila.push(c);        // Si es '(', lo agrega a la pila
            else if (c == ')') {               // Si es ')', debe emparejarse
                if (pila.isEmpty()) return false; // No hay '(' correspondiente
                pila.pop();                     // Empareja un '('
            }
        }
        // La expresión está balanceada si la pila queda vacía
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(estaBalanceada("((2+3)*5)"));  // true
        System.out.println(estaBalanceada("((2+3)*5"));   // false
    }
}



