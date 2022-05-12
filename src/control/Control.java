/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import interfaces.IPersistencia;
import javax.swing.JFrame;

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
    public void agregarLibro(JFrame Frame){
        
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
    
    public Tabla getTablaLibros(){
        return null;
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
