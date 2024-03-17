
package programacioniii.evaluacionexpresionmatematica.igu;

import java.util.HashMap;
import java.util.Map;
import programacioniii.evaluacionexpresionmatematica.logica.ControladoraLogica;

public class VentanaPrincipal extends javax.swing.JFrame {

    ControladoraLogica controlLogica = new ControladoraLogica();
    String expresion = "";
    String nombreVariables = "";
    String valorVariables = "";
    Map<String, Double> variablesAsignadas = new HashMap<>();
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelVentanaPrincipal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        txtExpresion = new javax.swing.JTextField();
        jLabelIndicacionesIngreso = new javax.swing.JLabel();
        btnIngresarVariables = new javax.swing.JButton();
        btnEvaluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultadoEvaluarExpresion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarArbol = new javax.swing.JTextArea();
        btnMostrarArbol = new javax.swing.JButton();
        jLabelRecorridosExpresion = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnMostrarRecorridos = new javax.swing.JButton();
        txtVariableIngresada = new javax.swing.JTextField();
        jLabelValorVariable = new javax.swing.JLabel();
        txtMostrarVariable = new javax.swing.JTextField();
        jLabelResultadoExpresion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMostrarRecorridos = new javax.swing.JTextArea();
        txtMostrarVariable2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitulo.setText("\"Evaluador de Expresiones Matemáticas\"");

        txtExpresion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtExpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpresionActionPerformed(evt);
            }
        });

        jLabelIndicacionesIngreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelIndicacionesIngreso.setText("Ingresar una expresion matemática, limitada a sumas, restas, multiplicaciones, divisiones, potencias y raíces.");

        btnIngresarVariables.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIngresarVariables.setText("Ingresar");
        btnIngresarVariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVariablesActionPerformed(evt);
            }
        });

        btnEvaluar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtResultadoEvaluarExpresion.setEditable(false);
        txtResultadoEvaluarExpresion.setColumns(20);
        txtResultadoEvaluarExpresion.setRows(5);
        jScrollPane1.setViewportView(txtResultadoEvaluarExpresion);

        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtMostrarArbol.setEditable(false);
        txtMostrarArbol.setColumns(20);
        txtMostrarArbol.setRows(5);
        jScrollPane2.setViewportView(txtMostrarArbol);

        btnMostrarArbol.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMostrarArbol.setText("Mostrar arbol");
        btnMostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarArbolActionPerformed(evt);
            }
        });

        jLabelRecorridosExpresion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelRecorridosExpresion.setText("Recorridos de expresion");

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnMostrarRecorridos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMostrarRecorridos.setText("Mostrar recorridos");
        btnMostrarRecorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecorridosActionPerformed(evt);
            }
        });

        txtVariableIngresada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVariableIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVariableIngresadaActionPerformed(evt);
            }
        });

        jLabelValorVariable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelValorVariable.setText("Valor de variables");

        txtMostrarVariable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMostrarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarVariableActionPerformed(evt);
            }
        });

        jLabelResultadoExpresion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelResultadoExpresion.setText("Resultado de evaluar expresion:");

        jScrollPane3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtMostrarRecorridos.setEditable(false);
        txtMostrarRecorridos.setColumns(20);
        txtMostrarRecorridos.setRows(5);
        jScrollPane3.setViewportView(txtMostrarRecorridos);

        txtMostrarVariable2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMostrarVariable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarVariable2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelVentanaPrincipalLayout = new javax.swing.GroupLayout(JPanelVentanaPrincipal);
        JPanelVentanaPrincipal.setLayout(JPanelVentanaPrincipalLayout);
        JPanelVentanaPrincipalLayout.setHorizontalGroup(
            JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIndicacionesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelVentanaPrincipalLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabelResultadoExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabelValorVariable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVariableIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIngresarVariables)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtMostrarVariable2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                                        .addComponent(txtMostrarVariable, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabelTitulo))
                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnEvaluar)
                        .addGap(66, 66, 66)
                        .addComponent(btnLimpiar)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabelRecorridosExpresion)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarRecorridos))
                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(btnMostrarArbol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelVentanaPrincipalLayout.setVerticalGroup(
            JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIndicacionesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMostrarVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMostrarVariable2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVariableIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelResultadoExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelVentanaPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(JPanelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRecorridosExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelVentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelVentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpresionActionPerformed

    private void btnIngresarVariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVariablesActionPerformed
        valorVariables = txtVariableIngresada.getText();
        
                    if((variablesAsignadas = asignarVariables(nombreVariables, valorVariables)) != null){
                        controlLogica.actualizarVariablesExpresion(variablesAsignadas);
                        txtMostrarVariable.setText("Variables ingresadas exitosamente");
                        txtResultadoEvaluarExpresion.setText("");
                        txtResultadoEvaluarExpresion.setText(String.valueOf(controlLogica.evaluarPostfijoConVariables()));

                    }else{
                        txtMostrarVariable.setText("Ingrese el valor de las variables en el mismo orden y separado por comas:");
                        txtMostrarVariable2.setText(nombreVariables);
                    }
 
    
    }//GEN-LAST:event_btnIngresarVariablesActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        //Limpiar datos del txtResultado
        txtResultadoEvaluarExpresion.setText("");
        //Obtener la expresion ingresada
        expresion = txtExpresion.getText();
        //Evaluar si es valida la expresion ingresada
        if(controlLogica.evaluarExpresionMatematica(expresion)){
            //Validar si hay variables para solicitar
            txtResultadoEvaluarExpresion.setText("Expresion valida");
            if(!controlLogica.getExpresionMatematica().getVariables().isEmpty()){
                nombreVariables = obtenerNombresVariables(controlLogica.getExpresionMatematica().getVariables());
                
                txtMostrarVariable.setText("Ingrese el valor de las variables en el mismo orden y separado por comas:");
                txtMostrarVariable2.setText(nombreVariables);
                
                
                }else{
                   txtMostrarVariable.setText("No hay variables"); 
            }
        }else{
            txtResultadoEvaluarExpresion.setText("Expresion no valida");
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnMostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarArbolActionPerformed
        txtMostrarArbol.setText("");    
        txtMostrarArbol.setText(controlLogica.getArbolGrafico());
    }//GEN-LAST:event_btnMostrarArbolActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtExpresion.setText("");
        txtMostrarArbol.setText("");
        txtMostrarRecorridos.setText("");
        txtMostrarVariable.setText("");
        txtResultadoEvaluarExpresion.setText("");
        txtVariableIngresada.setText("");
        // Si el método pedirVariables estaba en ejecución, se detiene
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMostrarRecorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecorridosActionPerformed
        txtMostrarRecorridos.setText("");
        txtMostrarRecorridos.setText(controlLogica.getRecorridos());
    }//GEN-LAST:event_btnMostrarRecorridosActionPerformed

    private void txtVariableIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVariableIngresadaActionPerformed
        
    }//GEN-LAST:event_txtVariableIngresadaActionPerformed

    private void txtMostrarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarVariableActionPerformed

    private void txtMostrarVariable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarVariable2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarVariable2ActionPerformed

    /**
     * Método que recibe un Map<String, Double> y retorna un String
     * con los nombres de las variables separados por comas.
     *
     * @param variables Un mapa que contiene nombres de variables
     *                  como clave y valores Double asociados.
     * @return Una cadena que contiene los nombres de las variables
     *         separados por comas.
     */
    public String obtenerNombresVariables(Map<String, Double> variables) {
        // Verificar si el mapa de variables está vacío
        if (variables == null || variables.isEmpty()) {
            return ""; // Retorna una cadena vacía si no hay variables
        }

        StringBuilder nombres = new StringBuilder(); // Para almacenar los nombres de las variables

        // Iterar a través de las claves (nombres de las variables) del mapa
        for (String nombre : variables.keySet()) {
            // Agregar el nombre de la variable al StringBuilder
            nombres.append(nombre).append(", ");
        }

        // Eliminar la última coma y el espacio extra
        nombres.delete(nombres.length() - 2, nombres.length());

        return nombres.toString(); // Retornar los nombres de las variables como una cadena
    }
    
        /**
     * Método que asigna valores a las variables de acuerdo con los nombres proporcionados.
     *
     * @param nombreVariables Cadena que contiene los nombres de las variables separados por comas.
     * @param valorVariables  Cadena que contiene los valores de las variables separados por comas.
     * @return Un mapa que contiene las variables asignadas con los nombres proporcionados.
     */
    public Map<String, Double> asignarVariables(String nombreVariables, String valorVariables) {
        // Verificar si las cadenas de nombres y valores son nulas o vacías
        if (nombreVariables == null || valorVariables == null ||
            nombreVariables.isEmpty() || valorVariables.isEmpty()) {
            return new HashMap<>(); // Retorna un mapa vacío si las cadenas son nulas o vacías
        }

        // Dividir las cadenas de nombres y valores en arrays utilizando la coma como delimitador
        String[] nombres = nombreVariables.split(",");
        String[] valores = valorVariables.split(",");

        // Crear un nuevo mapa para almacenar las variables asignadas
        Map<String, Double> variablesAsignadas = new HashMap<>();

        // Verificar si la cantidad de nombres y valores coincide
        if (nombres.length != valores.length) {
            // Si no coinciden, lanzar una excepción o manejar el error según sea necesario
            throw new IllegalArgumentException("La cantidad de nombres y valores no coincide");
        }

        // Iterar a través de los nombres y valores para asignar las variables
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i].trim(); // Obtener el nombre de la variable (sin espacios adicionales)
            Double valor;
            try {
                valor = Double.parseDouble(valores[i].trim()); // Convertir el valor a Double
            } catch (NumberFormatException e) {
                // Si ocurre un error al convertir, asignar null y manejar el error según sea necesario
                valor = null;
                System.err.println("Error al convertir el valor para la variable " + nombre);
            }
            // Asignar la variable al mapa
            variablesAsignadas.put(nombre, valor);
        }

        return variablesAsignadas; // Retornar el mapa con las variables asignadas
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelVentanaPrincipal;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnIngresarVariables;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarArbol;
    private javax.swing.JButton btnMostrarRecorridos;
    private javax.swing.JLabel jLabelIndicacionesIngreso;
    private javax.swing.JLabel jLabelRecorridosExpresion;
    private javax.swing.JLabel jLabelResultadoExpresion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValorVariable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtExpresion;
    private javax.swing.JTextArea txtMostrarArbol;
    private javax.swing.JTextArea txtMostrarRecorridos;
    private javax.swing.JTextField txtMostrarVariable;
    private javax.swing.JTextField txtMostrarVariable2;
    private javax.swing.JTextArea txtResultadoEvaluarExpresion;
    private javax.swing.JTextField txtVariableIngresada;
    // End of variables declaration//GEN-END:variables
}