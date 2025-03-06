import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test unitarios para la clase Libro
 * @see Libro
 * @author Marta Cruz
 * @version 6.3.2025
 */
class LibroTest {
 Libro libro;
    @BeforeEach
    void setUp() {
        Libro libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void LibroConstructor(){
        assertNotNull(libro.getTitulo());
    }

    @Test
    void getTitulo() {
    }

    @Test
    void setTitulo() {
    }

    @Test
    void getAutor() {
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
    }

    @Test
    void setAnioPublicacion() {
    }
}