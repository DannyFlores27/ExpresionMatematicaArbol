
package programacioniii.evaluacionexpresionmatematica.logica;

import java.util.Map;
import java.util.Stack;

public class Calculadora {

    public Calculadora() {
        // Constructor vacío
    }
    
        // Método para evaluar una expresión en postfijo dada
    public static double evaluarExpresionPostfijo(String expresion, Map<String, Double> variables) {
        // Caso base: si la expresión es nula o vacía, se termina el programa
        if (expresion == null || expresion.length() == 0) {
            System.exit(-1);
        }

        // Crea una pila vacía para almacenar operandos
        //Stack<Integer> pilaOperandos = new Stack<>();
        Stack<Double> pilaOperandosFinal = new Stack<>();

              // Recorre la expresión dada
              for (char caracter : expresion.toCharArray()) {
                  // Si el carácter actual es un dígito numérico
                  if (Character.isDigit(caracter)) {
                      pilaOperandosFinal.push((double)(caracter - '0')); // Convertir carácter a double y empujar a la pila
                  }
                  // Si el carácter actual es una variable
                  else if (Character.isLetter(caracter)) {
                      pilaOperandosFinal.push(obtenerValorVariable(caracter, variables)); // Obtener el valor de la variable y empujar a la pila
                  }
                  // Si el carácter actual es un operador
                  else {
                      // Extraer los dos operandos superiores de la pila
                      double operando2 = pilaOperandosFinal.pop();
                      double operando1 = pilaOperandosFinal.pop();

                // Evalúa la expresión 'operando1 operador operando2' y empuja el resultado de vuelta a la pila
                if (caracter == '+') {
                        pilaOperandosFinal.push(operando1 + operando2);
                }
                if (caracter == '-') {
                        pilaOperandosFinal.push(operando1 - operando2);
                }
                if (caracter == '*') {
                        pilaOperandosFinal.push(operando1 * operando2);
                }
                if (caracter == '/') {
                        pilaOperandosFinal.push(operando1 / operando2);
                }
                if (caracter == '^') {
                        pilaOperandosFinal.push(Math.pow(operando1, operando2));
                }

            }
        }

        // En este punto, la pila contendrá un solo elemento que es el resultado de la expresión
        return pilaOperandosFinal.pop();
    }
    
        public static double obtenerValorVariable(char variable, Map<String, Double> variables){
        
        double valor = 0.00;
        String variableBuscada = Character.toString(variable);
        
        // Comprobar si una variable está presente en el mapa antes de obtener su valor
        if (variables.containsKey(variableBuscada)) {
            valor = variables.get(variableBuscada);
        } else {
            valor = 0.00;
        }
        
        return valor;
        
        }

}

