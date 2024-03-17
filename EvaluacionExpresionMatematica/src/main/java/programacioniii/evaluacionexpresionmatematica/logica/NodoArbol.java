
package programacioniii.evaluacionexpresionmatematica.logica;

class NodoArbol {
    char dato;
    NodoArbol izquierda, derecha;

    public NodoArbol(){
      
    }

    public NodoArbol(char dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    NodoArbol(char dato, NodoArbol izquierda, NodoArbol derecha) {
        this.dato = dato;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public char getValor() {
        return dato;
    }

    public NodoArbol getIzquierda(){
        return izquierda;
    }

    public NodoArbol getDerecha(){
        return derecha;
    }
}