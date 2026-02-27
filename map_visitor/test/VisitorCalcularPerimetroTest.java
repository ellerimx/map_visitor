package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class VisitorCalcularPerimetroTest {

    private final VisitorCalcularPerimetro visitor = new VisitorCalcularPerimetro();

    @Test
    void perimetroCirculo() {
        Circulo c = new Circulo(10);
        assertEquals(2 * 3.14 * 10, visitor.visitaCirculo(c), 0.000001);
    }

    @Test
    void perimetroRetangulo() {
        Retangulo r = new Retangulo(5, 10);
        assertEquals(2 * 10 + 2 * 5, visitor.visitaRetangulo(r), 0.000001);
    }

    @Test
    void perimetroTriangulo_equilatero() {
        Triangulo t = new TrianguloEquilatero(2, 4, 6);
        assertEquals(6, visitor.visitaTriangulo(t), 0.000001);
    }

    @Test
    void perimetroTrapezio_formulaPadrao() {
        Trapezio tz = new Trapezio(40, 20, 8, 10, 10);
        double esperado = 40 + 20 + 10 + 10;

        assertEquals(esperado, visitor.visitaTrapezio(tz), 0.000001);
    }
}
