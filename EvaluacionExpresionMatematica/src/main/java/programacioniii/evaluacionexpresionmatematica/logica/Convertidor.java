
package programacioniii.evaluacionexpresionmatematica.logica;

import java.util.Stack;

public class Convertidor {
    public Convertidor() {
        // Constructor vacío
    }

    public String infijaAPostfija(String infija) {
        StringBuilder postfija = new StringBuilder();  
        Stack<Character> pila = new Stack<>();  

        for (int i = 0; i < infija.length(); i++) {
            char c = infija.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfija.append(c);
            }

            else if (c == '(') {
                pila.push(c);
            }

            else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop());
                }
                if (!pila.isEmpty() && pila.peek() == '(') {
                    pila.pop();  
                }
            }

            else {
                while (!pila.isEmpty() && precedencia(pila.peek()) >= precedencia(c)) {
                    postfija.append(pila.pop());
                }
                pila.push(c);  
            }
        }

        while (!pila.isEmpty()) {
            postfija.append(pila.pop());
        }

        return postfija.toString();  
    }

    private int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
}
