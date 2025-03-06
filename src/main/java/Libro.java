/**
 * Clase que representa una coleccion de libros que formaran parte de la clase biblioteca
 * Permite agregar libros y ver su titulo, autor y año publicacion.
 *
 * @see Biblioteca
 * @author Marta Cruz
 * @version 6.3.2025
 */
public class Libro {
    // TODO: Documentar estos atributos
    /**
     * Lista de atributos de los libros: titulo, autor  y año publicacion.
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método
    /**
     * Constructor con todos los parametros de la clase libros
     * @param titulo del libro
     * @param autor del libro
     * @param anioPublicacion año publicacion del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Metodo para obtener el autor de un libro
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Metodo para obtener el año de publicacion de un libro
     * @return autor del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}