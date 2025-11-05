/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo:  GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Pilas

Descripcion:
Evalúa una expresión aritmética en notación postfija (polaca inversa)
utilizando una pila para almacenar operandos.
---------------------------------------------------------------
*/

package pilas;

public class EvaluarPostfija {

    public static int evaluar(String expr) {
        Pila<Integer> pila = new Pila<>();
        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                pila.push(Integer.parseInt(token));
            } else {
                int b = pila.pop();
                int a = pila.pop();
                switch (token) {
                    case "+": pila.push(a + b); break;
                    case "-": pila.push(a - b); break;
                    case "*": pila.push(a * b); break;
                    case "/": pila.push(a / b); break;
                }
            }
        }
        return pila.pop();
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + evaluar("5 3 + 8 2 - *"));
    }
}
