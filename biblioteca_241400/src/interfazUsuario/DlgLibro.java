/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import java.awt.Point;
import objetosnegocio_241400.Libro;
/**
 *
 * @author paulvazquez
 */
public class DlgLibro extends javax.swing.JDialog {
    /** 
    * Constructor que establece las características del cuadro de diálogo
    * y la operación a realizar con él
    * @param parent Ventana sobre la que aparecerá el cuadro de diálogo
    * @param title Título del cuadro de diálogo
    * @param modal true si permite acceder fuera de los límites del cuadro
    * de diálogo, false en caso contrario
    * @param libro Canción a capturar, editar o desplegar
    * @param operacion Operación a realizar en el cuadro de diálogo:
    *        AGREGAR = 0, ACTUALIZAR = 1, ELIMINAR = 2, DESPLEGAR = 3;
    * @param respuesta Boton presionado al salir de los cuadros de
    * diálogos: ACEPTAR = "Aceptar", CANCELAR = "Cancelar".
    */
    public DlgLibro(java.awt.Frame parent, String title, boolean modal, Libro libro, 
            int operacion, StringBuffer respuesta) {
        super(parent, title, modal);
        this.libro = libro;
        this.operacion = operacion;
        this.respuesta = respuesta;
        
        initComponents();
        
        //Modifica el título del botón botonAceptar y establece si los
        //botones boronRestaurar y botonCancelar estarán habilitados.
        //Si la operación es agregar
        if (operacion == ConstantesGUI.AGREGAR)
            botonAceptar.setText("Guardar");
        // Si la operación es actualizar
        else
            if (operacion == ConstantesGUI.ACTUALIZAR)
                botonAceptar.setText("Actualizar");
            // Si la operación es eliminar
            else if (operacion == ConstantesGUI.ELIMINAR)
            {
                botonAceptar.setText("Eliminar");
                botonRestaurar.setEnabled(false);
            }
        // Si la operación es desplegar
            else if(operacion == ConstantesGUI.DESPLEGAR) {
                botonAceptar.setText("Continuar");
                botonRestaurar.setEnabled(false);
                botonCancelar.setEnabled(false);
            }
        //Despliega el titulo del libro
        campoTextoTitulo.setText(libro.getTitulo());
        
        // Si la operación es de actualizar, eliminar o desplegar,
        if((operacion == ConstantesGUI.ELIMINAR) ||
          (operacion == ConstantesGUI.ACTUALIZAR) ||
          (operacion == ConstantesGUI.DESPLEGAR)) {
            campoTextoTitulo.setText(libro.getTitulo()); campoTextoAutor.setText(libro.getAutor());
            campoTextoClasificacion.setText(libro.getClasificacion()); campoTextoEdicion.setText(libro.getEdicion());
            campoTextoEditorial.setText(libro.getEditorial()); campoTextoIsbn.setText(libro.getISBN());
        }
        // Si la operación es de eliminar o desplegar
        if((operacion == ConstantesGUI.ELIMINAR) ||
          (operacion == ConstantesGUI.DESPLEGAR)) {
            // hace los campos de texto de sólo lectura
            campoTextoTitulo.setEditable(false);
            campoTextoAutor.setEditable(false);
            campoTextoClasificacion.setEnabled(false);
            campoTextoEdicion.setEditable(false);
            campoTextoEditorial.setEditable(false);
            campoTextoIsbn.setEditable(false);
        }
        // Establece el valor por omisión para respuesta, por si se cierra el
        //cuadro de diálogo presionando el botón cerrar o el botón cancelar
        respuesta.append(ConstantesGUI.CANCELAR);
        respuesta.append(ConstantesGUI.CANCELAR);
        
        //Centra el cuadro de dialogo sobre la ventana de la aplicación
        centraCuadroDialogo(parent);
        
        //Muestra el cuadro de diálogo
        setVisible(true);
    }
    /**
         * Este método centra el cuadro de dialogo sobre la ventana de la aplicacion
         * @param parent Ventana sobre la que aparecera el cuadro de dialogo.
         */
    private void centraCuadroDialogo(java.awt.Frame parent){
        //Obtiene ek tamaño y posición de la ventana de la aplicación.
        Dimension frameSize = parent.getSize();
        Point loc = parent.getLocation();
        
        //Obtiene el tamaño del cuadro de diálogo.
        Dimension dlgSize = getPreferredSize();
        
        //Centra el cuadro de diálogo sobre la ventana padre
        setLocation((frameSize.width - dlgSize.width)/2 + loc.x, (frameSize.height - dlgSize.height)/2 + loc.y);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoTextoTitulo = new javax.swing.JTextField();
        campoTextoAutor = new javax.swing.JTextField();
        campoTextoClasificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoTextoEdicion = new javax.swing.JTextField();
        campoTextoEditorial = new javax.swing.JTextField();
        campoTextoIsbn = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        botonRestaurar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Titulo");

        jLabel2.setText("Autor");

        jLabel3.setText("Edición");

        campoTextoTitulo.setEditable(false);
        campoTextoTitulo.setColumns(10);

        campoTextoAutor.setEditable(false);
        campoTextoAutor.setColumns(10);

        campoTextoClasificacion.setEditable(false);
        campoTextoClasificacion.setColumns(10);

        jLabel4.setText("Editorial");

        jLabel5.setText("ISBN");

        jLabel6.setText("Clasificación");

        campoTextoEdicion.setEditable(false);
        campoTextoEdicion.setColumns(10);

        campoTextoEditorial.setEditable(false);
        campoTextoEditorial.setColumns(10);

        campoTextoIsbn.setEditable(false);
        campoTextoIsbn.setColumns(10);

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonRestaurar.setText("Restaurar");
        botonRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaurarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRestaurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTextoClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTextoEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTextoEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTextoIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonRestaurar)
                    .addComponent(botonCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método oyente del botón botonAceptar
     *
     * @param evt Evento al que escucha
     */
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // Si la operación es Agregar o Actualizar
        if ((operacion == ConstantesGUI.AGREGAR)
                || (operacion == ConstantesGUI.ACTUALIZAR)) {
            // Toma los valores capturados en los campos de texto y en la caja
           // combinada y almacénalos en el parámetro cancion.
           libro.setTitulo(campoTextoTitulo.getText());
           libro.setAutor(campoTextoAutor.getText());
           libro.setClasificacion(campoTextoClasificacion.getText());
           libro.setEdicion(campoTextoEdicion.getText());
           libro.setEditorial(campoTextoEditorial.getText());
           libro.setISBN(campoTextoIsbn.getText());
        }
        // Borra el contenido de respuesta
        respuesta.delete(0, respuesta.length());
       // Establece que se presionó el botón botonAceptar
       respuesta.append(ConstantesGUI.ACEPTAR);
       //Destruye el cuadro de díalogo
       dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    /**
     * Método oyente del botón botonRestaurar
     *
     * @param evt Evento al que escucha
     */
    private void botonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaurarActionPerformed
        // Restaura el contenido de los campos de texto a su valor original
        //Si la operación es Agregar
        if(operacion == ConstantesGUI.AGREGAR) {
            campoTextoTitulo.setText("");
            campoTextoAutor.setText("");
            campoTextoClasificacion.setText("");
            campoTextoEdicion.setText("");
            campoTextoEditorial.setText("");
            campoTextoIsbn.setText("");
        }
        // Si la operación es Actualizar
        if(operacion == ConstantesGUI.ACTUALIZAR) {
            campoTextoTitulo.setText(libro.getTitulo()); campoTextoAutor.setText(libro.getAutor());
            campoTextoClasificacion.setText(libro.getClasificacion()); campoTextoEdicion.setText(libro.getEdicion()); 
            campoTextoEditorial.setText(libro.getEditorial()); campoTextoIsbn.setText(libro.getISBN());
        }
    }//GEN-LAST:event_botonRestaurarActionPerformed

    /**
     * Método oyente del botón botonCancelar
     *
     * @param evt Evento al que escucha
     */
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // Destruye el cuadro de díalogo
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRestaurar;
    private javax.swing.JTextField campoTextoAutor;
    private javax.swing.JTextField campoTextoClasificacion;
    private javax.swing.JTextField campoTextoEdicion;
    private javax.swing.JTextField campoTextoEditorial;
    private javax.swing.JTextField campoTextoIsbn;
    private javax.swing.JTextField campoTextoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    private Libro libro;
    private int operacion;
    private StringBuffer respuesta;
}
