/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;
import java.awt.Dimension;
import java.awt.Point;
import objetosnegocio_241400.Prestamo;
import objetosnegocio_241400.PublicacionED;

/**
 *
 * @author paulvazquez
 */
public class DlgPrestamo extends javax.swing.JDialog {
/** 
    * Constructor que establece las características del cuadro de diálogo
    * y la operación a realizar con él
    * @param parent Ventana sobre la que aparecerá el cuadro de diálogo
    * @param title Título del cuadro de diálogo
    * @param modal true si permite acceder fuera de los límites del cuadro
    * de diálogo, false en caso contrario
    * @param prestamo Canción a capturar, editar o desplegar
    * @param operacion Operación a realizar en el cuadro de diálogo:
    *        AGREGAR = 0, ACTUALIZAR = 1, ELIMINAR = 2, DESPLEGAR = 3;
    * @param respuesta Boton presionado al salir de los cuadros de
    * diálogos: ACEPTAR = "Aceptar", CANCELAR = "Cancelar".
    */
    public DlgPrestamo(java.awt.Frame parent, String title, boolean modal, Prestamo prestamo, 
            int operacion, StringBuffer respuesta) {
        super(parent, modal);
        this.prestamo = prestamo;
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
        campoTextoUsuario.setText(usuario.getNombre());
        
        // Si la operación es de actualizar, eliminar o desplegar,
        if((operacion == ConstantesGUI.ELIMINAR) ||
          (operacion == ConstantesGUI.ACTUALIZAR) ||
          (operacion == ConstantesGUI.DESPLEGAR)) {
            campoTextoUsuario.setText(prestamo.getUsuario());
            campoTextoPublicacion.setText(usuario.getDireccion());
            campoTextoFechaPres.setText(usuario.getTelefono());
            campoTextoTiempoPrest.setText(usuario.getNumCredencial());
        }
        // Si la operación es de eliminar o desplegar
        if((operacion == ConstantesGUI.ELIMINAR) ||
          (operacion == ConstantesGUI.DESPLEGAR)) {
            // hace los campos de texto de sólo lectura
            campoTextoUsuario.setEditable(false);
            campoTextoPublicacion.setEditable(false);
            campoTextoFechaPres.setEnabled(false);
            campoTextoTiempoPrest.setEditable(false);    
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

        botonRestaurar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoTextoUsuario = new javax.swing.JTextField();
        campoTextoPublicacion = new javax.swing.JTextField();
        campoTextoTiempoPrest = new javax.swing.JTextField();
        campoTextoFechaPres = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setText("Usuario");

        jLabel2.setText("Publicación");

        jLabel3.setText("Tiempo de préstamo");

        campoTextoUsuario.setEditable(false);
        campoTextoUsuario.setColumns(10);

        campoTextoPublicacion.setEditable(false);
        campoTextoPublicacion.setColumns(10);

        campoTextoTiempoPrest.setEditable(false);
        campoTextoTiempoPrest.setColumns(10);

        campoTextoFechaPres.setEditable(false);
        campoTextoFechaPres.setColumns(10);

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha de préstamo");

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
                            .addComponent(campoTextoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoFechaPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoTiempoPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTextoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTextoFechaPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTextoTiempoPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonRestaurar)
                    .addComponent(botonCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaurarActionPerformed
        // Restaura el contenido de los campos de texto a su valor original
        //Si la operación es Agregar
        if(operacion == ConstantesGUI.AGREGAR) {
            campoTextoUsuario.setText("");
            campoTextoPublicacion.setText("");
            campoTextoFechaPres.setText("");
            campoTextoTiempoPrest.setText("");
        }
        // Si la operación es Actualizar
        if(operacion == ConstantesGUI.ACTUALIZAR) {
            campoTextoUsuario.setText(usuario.getNombre()); campoTextoPublicacion.setText(usuario.getDireccion());
            campoTextoFechaPres.setText(usuario.getTelefono()); campoTextoTiempoPrest.setText(usuario.getNumCredencial());
        }
    }//GEN-LAST:event_botonRestaurarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // Destruye el cuadro de díalogo
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // Si la operación es Agregar o Actualizar
        if ((operacion == ConstantesGUI.AGREGAR)
            || (operacion == ConstantesGUI.ACTUALIZAR)) {
            // Toma los valores capturados en los campos de texto y en la caja
            // combinada y almacénalos en el parámetro cancion.
            prestamo.setUsuario(campoTextoUsuario.getText());
            prestamo.setPublicacion(campoTextoPublicacion.getText());
            prestamo.setTelefono(campoTextoFechaPres.getText());
            prestamo.setNumCredencial(campoTextoTiempoPrest.getText());
        }
        // Borra el contenido de respuesta
        respuesta.delete(0, respuesta.length());
        // Establece que se presionó el botón botonAceptar
        respuesta.append(ConstantesGUI.ACEPTAR);
        //Destruye el cuadro de díalogo
        dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRestaurar;
    private javax.swing.JTextField campoTextoFechaPres;
    private javax.swing.JTextField campoTextoPublicacion;
    private javax.swing.JTextField campoTextoTiempoPrest;
    private javax.swing.JTextField campoTextoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private Prestamo prestamo;
    private int operacion;
    private StringBuffer respuesta;
}