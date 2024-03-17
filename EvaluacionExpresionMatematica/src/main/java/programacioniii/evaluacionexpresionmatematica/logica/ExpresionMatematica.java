    package programacioniii.evaluacionexpresionmatematica.logica;

    import java.util.HashMap;
    import java.util.Map;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class ExpresionMatematica {

      private String expresion;
      private Map<String, Double> variables;

      public ExpresionMatematica () {
          this.expresion = "";
          this.variables = new HashMap<>();
      }

        public String getExpresion() {
            return expresion;
        }

        public void setExpresion(String expresion) {
            this.expresion = expresion;
        }



      /**
       * Método para buscar variables en una expresión matemática y guardarlas en un mapa.
       * Las variables se almacenan en el mapa con valor nulo.
       * @param expresion La expresión matemática en la que buscar variables.
       */
      public void buscarVariables(String expresion) {
          // Expresión regular para encontrar letras
          Pattern patron = Pattern.compile("[a-zA-Z]+");
          Matcher matcher = patron.matcher(expresion);

          // Recorrer la expresión y buscar letras
          while (matcher.find()) {
              String variable = matcher.group();

              // Agregar la variable al mapa si no existe y no es un número
              if (!variable.isEmpty() && !variable.matches("[0-9]+")) {
                  if (!variables.containsKey(variable)) {
                      variables.put(variable, 0.00);
                  }
              }
          }
      }


      //Método para obtener el mapa de variables.
      public Map<String, Double> getVariables() {
          return variables;
      }

      /**
       * Método para actualizar el valor de una variable en el mapa.
       * @param variable La variable cuyo valor se actualizará.
       * @param valor El nuevo valor de la variable.
       */
      public void actualizarVariable(String variable, double valor) {
          if (variables.containsKey(variable)) {
              variables.put(variable, valor);
          } else {
              // Manejo de error si la variable no existe en el mapa
              throw new IllegalArgumentException("La variable '" + variable + "' no está presente en la expresión.");
          }
      }

      /**
       * Método para actualizar el valor de todas las variables en el mapa.
       * @param nuevosValores Un mapa que contiene los nuevos valores para las variables.
       */
      public void actualizarVariables(Map<String, Double> nuevosValores) {
          for (Map.Entry<String, Double> entry : nuevosValores.entrySet()) {
              String variable = entry.getKey();
              Double valor = entry.getValue();

              // Verificar si la variable existe en el mapa
              if (variables.containsKey(variable)) {
                  variables.put(variable, valor);
              } else {
                  // Manejo de error si la variable no existe en el mapa
                  throw new IllegalArgumentException("La variable '" + variable + "' no está presente en la expresión.");
              }
          }
      }

    public static boolean validarExpresionMatematica(String expresion) {
      // Eliminar espacios en blanco
      expresion = expresion.replaceAll("\\s+", "");

      // Validar longitud mínima
      if (expresion.length() < 3) {
        return false;
      }

      // Validar caracteres permitidos
      if (!expresion.matches("[\\d\\w\\.\\(\\)\\{\\}\\[\\]\\+\\-\\*/^\\=]+")) {
        return false;
      }

      // Validar paréntesis, corchetes y llaves
      if (!validarParentesis(expresion) || !validarCorchetes(expresion) || !validarLlaves(expresion)) {
        return false;
      }

      // Validar cantidad de operandos respecto a la cantidad de signos
      if (!validarCantidadOperandos(expresion)) {
        return false;
      }

      return true;
    }

    private static boolean validarParentesis(String expresion) {
      int contador = 0;
      for (char c : expresion.toCharArray()) {
        if (c == '(') {
          contador++;
        } else if (c == ')') {
          contador--;
        }
        if (contador < 0) {
          return false;
        }
      }
      return contador == 0;
    }

    private static boolean validarCorchetes(String expresion) {
      int contador = 0;
      for (char c : expresion.toCharArray()) {
        if (c == '[') {
          contador++;
        } else if (c == ']') {
          contador--;
        }
        if (contador < 0) {
          return false;
        }
      }
      return contador == 0;
    }

    private static boolean validarLlaves(String expresion) {
      int contador = 0;
      for (char c : expresion.toCharArray()) {
        if (c == '{') {
          contador++;
        } else if (c == '}') {
          contador--;
        }
        if (contador < 0) {
          return false;
        }
      }
      return contador == 0;
    }

      private static boolean validarCantidadOperandos(String expresion) {
          int operadores = 0;
          int operandos = 0;
          boolean enOperandos = false; // Indicador para detectar cuando estamos dentro de un operando

          for (char c : expresion.toCharArray()) {
              if (esOperadorMatematico(c)) {
                  operadores++;
                  enOperandos = false; // Reiniciar indicador cuando encontramos un operador
              } else if (Character.isDigit(c) || Character.isLetter(c)) {
                  if (!enOperandos) {
                      operandos++;
                      enOperandos = true; // Estamos dentro de un operando
                  }
              } else {
                  // Reiniciar indicador si encontramos un carácter no válido (por ejemplo, un espacio en blanco)
                  enOperandos = false;
              }
          }

          return operandos == operadores + 1;
      }


      private static boolean esOperadorMatematico(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '=';
      }


     } 