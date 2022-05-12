/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import interfaces.IPersistencia;
import interfazUsuario.DlgLibro;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objetosnegocio_241400.Libro;
import persistencia.PersistenciaListas;

/**
 *
 * @author paulvazquez
 */
public class Control {
    //Acceso a los objetos del negocio
    private IPersistencia persistencia;
    private Conversiones conversiones;
    
    /**
     * Constructor.
     */
    public Control(){
        //Crea un objeto del tipo persistencia
        /*Tengo un error en IPersistencia
        persistencia = new IPersistencia();
        */
        conversiones = new Conversiones();
    }
    
    /**
     * Agrega un libro al catalogo de libros
     * @param frame Ventana sobre la que se despliega el cuadro de diálogo para
     * capturar los datos del libro
     * @return Regresa true si se pudo agregar el libro, false en caso contrario
     */
    public boolean agregarLibro(JFrame frame){
        Libro libro, bLibro;
        StringBuffer respuesta = new StringBuffer("");
        DlgLibro dlgLibro;
        List<Libro> listaLibros;
        DefaultComboBoxModel<Libro> LibrosComboBoxModel;
        //Captura la clave del Libro
        String Isbn = JOptionPane.showInputDialog(frame, "Clave del libro:",
                "Agregar libro",
                JOptionPane.QUESTION_MESSAGE);
        //Si el usuario presiono el boton Cancelar
        if(Isbn == null)
            return false;
        //Crea un objeto Libro con solo la clave
        libro = new Libro(Isbn);
        try {
            //Obten la cancion del catalogo de Libros
            bLibro = persistencia.obten(libro);
        }
        catch (Exception e) {
            //Si ocurrio un error al leer del catalogo de libros,
            //despliega mensaje de error
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error!!.",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
    }
    
    public void actualizarLibro(){
        
    }
    
    public void eliminarLibro(){
        
    }
    
    public void agregarUsuario(){
        
    }
    
    public void actualizarUsuario(){
        
    }
    
    public void eliminarUsuario(){
        
    }
    
    public void inventariarLibro(){
        
    }
    
    public void desinventariarLibro(){
        
    }
    
    public void prestarLibro(){
        
    }
    
    public void devolverLibro(){
        
    }
    
    public Tabla getTablaLibros(JFrame frame) {
        List<Libro> listaCanciones;
        try {
            //Obtiene la lista de libros
            listaCanciones = persistencia.consultarLibros();
        }
        catch (Exception e) {
            //Si ocurrio un error al obtener la lista de la base de datos,
            //despliega mensaje de error
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error!!.",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
        //Regresa el objeto Tabla con todas los libros
        return new Tabla("Lista de Libros",
                conversiones.librosTableModel(listaCanciones)); 
    }
    
    public Tabla getTablaLibrosAutor(){
        return null;
    }
    
    public Tabla getTablaLibrosEditorial(){
        return null;
    }
    
    public Tabla getTablaLibrosClasificacion(){
        return null;
    }
    
    public Tabla getTablaUsuarios(){
        return null;
    }
    
    public Tabla getTablaInventarioLibros(){
        return null;
    }
    
    public Tabla getTablaLibrosPrestados(){
        return null;
    }
    
    public Tabla getTablaLibrosDisponibles(){
        return null;
    }
    
    public Tabla getTablaPrestamosLibros(){
        return null;
    }
    
    public Tabla getTablaPrestamosLibrosUsuario(){
        return null;
    }
    
    public Tabla getTablaPrestamosLibro(){
        return null;
    }
    
    public Tabla getTablaPrestamosLibrosPeriodo(){
        return null;
    }
}
