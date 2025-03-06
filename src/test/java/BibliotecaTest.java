import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        Libro libro = new Libro("The Art of Computer Programming",
               "Donald Knuth", 1968);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro));
    }

    /**
     * Test unitarios para la clase Biblioteca
     * @see Biblioteca
     * @author Marta Cruz
     * @version 6.3.2025
     */

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(libro));
        assertEquals(false, biblioteca.getLibros().contains(libro));
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(this.libro);
        assertNotNull(biblioteca.getLibros());
        assertEquals(biblioteca.getLibros().size(), 1);
        assertTrue(biblioteca.getLibros().contains(libro));
    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(this.libro);
        //no esta vacia
        assertNotNull(biblioteca.getLibros());
        // solo tiene un libro
        assertEquals(biblioteca.getLibros().size(), 1);
        // contiene el libro con ese autor
        assertTrue(biblioteca.getLibros().contains(libro));
    }
}