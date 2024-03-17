
package programacioniii.evaluacionexpresionmatematica.logica;

import java.util.Stack;


public class ArbolExpresion {

    public ArbolExpresion(){
      
    }

    public NodoArbol construirArbol(String expresion) {
        return construir(expresion);
    }

    // Función para verificar si un carácter dado es un operador
    public static boolean esOperador(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Imprime la expresión de sufijo para un árbol de expresión
    public static String imprimirPosorden(NodoArbol raiz) {
        String posorden = "";
        
        if (raiz == null) {
            return posorden;
        }
        posorden += imprimirPosorden(raiz.izquierda);
        posorden += imprimirPosorden(raiz.derecha);
        posorden += raiz.dato;
        
        return posorden;
    }

    // Imprime la expresión infija para un árbol de expresión
    public static String imprimirInfijo(NodoArbol raiz) {
        String recorrido = "";
        
        if (raiz == null) {
            return recorrido;
        }
        

        // Si el carácter actual es un operador, imprime un paréntesis abierto
        if (esOperador(raiz.dato)) {
            recorrido += "(";
        }

        recorrido += imprimirInfijo(raiz.izquierda);
        recorrido += raiz.dato;
        recorrido += imprimirInfijo(raiz.derecha);

        // Si el carácter actual es un operador, imprime un paréntesis cerrado
        if (esOperador(raiz.dato)) {
            recorrido += ")";
        }
        
        return recorrido;
    }

    // Función para construir un árbol de expresión a partir de la expresión de sufijo dada
    private static NodoArbol construir(String sufijo) {
        // Caso base
        if (sufijo == null || sufijo.length() == 0) {
            return null;
        }

        // Crea una pila vacía para almacenar punteros de árbol
        Stack<NodoArbol> pila = new Stack<>();

        // Recorre la expresión de sufijo
        for (char c : sufijo.toCharArray()) {
            // Si el carácter actual es un operador
            if (esOperador(c)) {
                // Extrae dos nodos `x` e `y` de la pila
                NodoArbol x = pila.pop();
                NodoArbol y = pila.pop();

                // Construye un nuevo árbol binario con la raíz como el operador
                // y cuyos hijos izquierdo y derecho son `y` y `x`, respectivamente
                NodoArbol nodo = new NodoArbol(c, y, x);

                // Inserta el nodo actual en la pila
                pila.push(nodo);
            }
            // Si el carácter actual es un operando, crea un nuevo nodo y lo apila
            else {
                pila.push(new NodoArbol(c));
            }
        }

        // Un puntero a la raíz del árbol de expresión permanece en la pila
        return pila.peek();
    }

  // Método para imprimir el árbol de expresión en orden
  public static void printInOrder(NodoArbol root) {
      if (root != null) {
          printInOrder(root.izquierda);
          System.out.print(root.dato + " ");
          printInOrder(root.derecha);
      }
  }

  // Método para obtener la representación en forma de texto del árbol.
  public String obtenerRepresentacionEnTexto(NodoArbol raiz) {
      StringBuilder arbolEnTexto = new StringBuilder();
      obtenerRepresentacionEnTextoAux(raiz, "", true, arbolEnTexto);
      return arbolEnTexto.toString();
  }

  // Método auxiliar recursivo para obtener la representación en texto del árbol.
  private void obtenerRepresentacionEnTextoAux(NodoArbol nodo, String prefijo, boolean esIzquierdo, StringBuilder sb) {
      if (nodo != null) {
          sb.append(prefijo);
          sb.append(esIzquierdo ? "├── " : "└── ");
          sb.append(nodo.getValor());
          sb.append("\n");

          // Si hay un subárbol derecho o izquierdo, se deben agregar más prefijos.
          if (nodo.getIzquierda() != null || nodo.getDerecha() != null) {
              obtenerRepresentacionEnTextoAux(nodo.getIzquierda(), prefijo + (esIzquierdo ? "│   " : "    "), true, sb);
              obtenerRepresentacionEnTextoAux(nodo.getDerecha(), prefijo + (esIzquierdo ? "│   " : "    "), false, sb);
          }
      }
  }


}

