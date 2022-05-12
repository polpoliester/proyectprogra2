/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import objetosnegocio_241400.Libro;
import objetosnegocio_241400.Usuario;
import objetosnegocio_241400.PublicacionED;
/**
 * Esta clase contiene métodos que generan objetos del tipo DefaultTableModel
 * y DefaultComboBoxModel para crear instancias de Jtable y JComboBox.
 * @author paulvazquez
 */
public class Conversiones {
    // Arreglos con los nombres de las columnas de las tablas
    private String nombresColumnasTablasLibros[] = {"Titulo", "Autor", "Clasificación", "Edición",
                                             "Editorial", "ISBN"};
    private String nombresColumnasTablasUsuarios[] = {"Nombre", "Dirección", "Teléfono", "Núm Credencial"};
    private String nombresColumnasTablasInventarioLibros[] = {"Titulo", "Clasificación", "ISBN"};
    private String nombresColumnasTablasPrestamosLibros[] = {"Usuario", "Publicación", "Fecha", "Tiempo del prestamo"};

/**
  * Genera un objeto de tipo DefaultTableModel a partir de una lista de
  * canciones.
  *
  * @param listaLibros Lista de canciones a convertir
  * @return Objeto de tipo DefaultTableModel con los atributos de las
  * canciones.
  */
public DefaultTableModel librosTableModel(List<Libro> listaLibros){
    Object tabla[][];
    
    if (listaLibros != null)
    {
        tabla = new Object[listaLibros.size()][6];
        for (int i = 0; i < listaLibros.size(); i++)
        {
            //Obten una canción de la lista de canciones
            Libro libro = listaLibros.get(i);
            //Almacena sus atributos en la fila del arreglo
            tabla[i][0] = libro.getTitulo();
            tabla[i][1] = libro.getAutor();
            tabla[i][2] = libro.getClasificacion();
            tabla[i][3] = libro.getEdicion();
            tabla[i][4] = libro.getEditorial();
            tabla[i][5] = libro.getISBN();
        }
     return new DefaultTableModel(tabla, nombresColumnasTablasLibros);
    }
    return null;
}
 /**
  * Genera un objeto de tipo DefaultTableModel a partir de una lista de
  * libros.
  *
  * @param listaUsuarios Lista de peliculas a convertir
  * @return Objeto de tipo DefaultTableModel con los atributos de las
  * peliculas.
  */
public DefaultTableModel usuariosTableModel(List<Usuario> listaUsuarios){
    Object tabla[][];

    if (listaUsuarios != null){
        tabla = new Object[listaUsuarios.size()][6];
        for (int i = 0; i < listaUsuarios.size(); i++)
        {
         //Obten una canción de la lista de canciones
         Usuario usuario = listaUsuarios.get(i);
         //Almacena sus atributos en la fila del arreglo
         tabla[i][0] = usuario.getNombre();
         tabla[i][1] = usuario.getDireccion();
         tabla[i][2] = usuario.getTelefono();
         tabla[i][3] = usuario.getNumCredencial();
        }
     return new DefaultTableModel(tabla, nombresColumnasTablasUsuarios);
    }
    return null;
}
/**
 * Genera un objeto de tipo DefaultTableModel a partir de una lista de
 * generos.
 *
 * @param listaInventarioLibros Lista de generos a convertir
 * @return Objeto de tipo DefaultTableModel con los atributos de los
 * generos.
 */
public DefaultTableModel inventarioTableModel(List<Libro> listaInventarioLibros) {
    Object tabla[][];
    
    if (listaInventarioLibros != null){
        tabla = new Object[listaInventarioLibros.size()][6];
        for (int i = 0; i < listaInventarioLibros.size(); i++)
        {
         //Obten una canción de la lista de canciones
         Libro libro = listaInventarioLibros.get(i);
         //Almacena sus atributos en la fila del arreglo
         tabla[i][0] = libro.getTitulo();
         tabla[i][1] = libro.getClasificacion();
         tabla[i][2] = libro.getISBN();
        }
     return new DefaultTableModel(tabla, nombresColumnasTablasInventarioLibros);
    }
    return null;
}
public DefaultTableModel prestamosTableModel(List<PublicacionED> listaInventarioPrestamosLibros) {
    Object tabla[][];
    
    if (listaInventarioPrestamosLibros != null){
        tabla = new Object[listaInventarioPrestamosLibros.size()][3];
        for (int i = 0; i < listaInventarioPrestamosLibros.size(); i++)
        {
         //Obten una canción de la lista de canciones
         PublicacionED publicacionED = listaInventarioPrestamosLibros.get(i);
         //Almacena sus atributos en la fila del arreglo
         tabla[i][0] = publicacionED.getPublicacion();
         tabla[i][1] = publicacionED.getExistencia();
         tabla[i][2] = publicacionED.getDisponibilidad();
        }
     return new DefaultTableModel(tabla, nombresColumnasTablasInventarioLibros);
    }
    return null;
}
/**
 * Genera un objeto de tipo DefaultComboBoxModel a partir de una lista de
 * libros.
 */
public DefaultComboBoxModel<Libro> librosComboBoxModel(List<Libro> listaLibros) {
    DefaultComboBoxModel<Libro> defaultComboBoxModel = new DefaultComboBoxModel<>();
    if (listaLibros != null) {
        //Para cada elemento de la Lista
        for (int i = 0; i < listaLibros.size(); i++)
        {
          //Agregalo a la instancia de la clase DefaultComboBoxModel
          defaultComboBoxModel.addElement(listaLibros.get(i));
        }
        return defaultComboBoxModel;
    }
    return null;
}
}