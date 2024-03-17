
package programacioniii.evaluacionexpresionmatematica.logica;

import java.util.Map;

public class ControladoraLogica {

    private ExpresionMatematica expresionMatematica = new ExpresionMatematica();
    private Convertidor convertidor = new Convertidor();
    private NodoArbol raiz = new NodoArbol();
    private ArbolExpresion arbolExpresion = new ArbolExpresion();
    private double resultado;
    private String postfija, arbolGrafico;
    
    public boolean evaluarExpresionMatematica(String expresion) {
        //Validar si la expresion ingresada es correcta
        if(ExpresionMatematica.validarExpresionMatematica(expresion)){
            //Asignar la expresion ingresada
            expresionMatematica.setExpresion(expresion);
            //Actualizar la lista de variables de acuerdo a la expresion aritmetica ingresada
            expresionMatematica.buscarVariables(expresion);
            postfija = convertidor.infijaAPostfija(expresion);
            raiz = arbolExpresion.construirArbol(postfija);
            arbolGrafico = arbolExpresion.obtenerRepresentacionEnTexto(raiz);
        }else{
            return false;
        }
        return true;
    }
    
    public void actualizarVariablesExpresion(Map<String, Double> variables){
        this.expresionMatematica.actualizarVariables(variables);
    }

    public ExpresionMatematica getExpresionMatematica() {
        return expresionMatematica;
    }

    public void setExpresionMatematica(ExpresionMatematica expresionMatematica) {
        this.expresionMatematica = expresionMatematica;
    }

    public Convertidor getConvertidor() {
        return convertidor;
    }

    public void setConvertidor(Convertidor convertidor) {
        this.convertidor = convertidor;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public ArbolExpresion getArbolExpresion() {
        return arbolExpresion;
    }

    public void setArbolExpresion(ArbolExpresion arbolExpresion) {
        this.arbolExpresion = arbolExpresion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getPostfija() {
        return postfija;
    }

    public void setPostfija(String postfija) {
        this.postfija = postfija;
    }

    public String getArbolGrafico() {
        return arbolGrafico;
    }


    public double evaluarPostfijoConVariables() {
   
        return Calculadora.evaluarExpresionPostfijo(postfija, expresionMatematica.getVariables());
        
    }
    
    public String getRecorridos() {
       
        String recorridoInfijo = ("Recorrido infijo: " + ArbolExpresion.imprimirInfijo(raiz) + "\n\n");
        String recorridoPostfijo = ("Recorrido postfijo: " + postfija);

        String recorridos = recorridoInfijo + recorridoPostfijo;
        
    return recorridos;
        
    }

    public void setArbolGrafico(String arbolGrafico) {
        this.arbolGrafico = arbolGrafico;
    }

    
   
}
