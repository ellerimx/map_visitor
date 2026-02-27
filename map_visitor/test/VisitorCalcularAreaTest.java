package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class VisitorCalcularAreaTest {

    private final VisitorCalcularArea visitor = new VisitorCalcularArea();

    @Test
    void areaCirculo() {
        Circulo c = new Circulo(10);
        assertEquals(3.14 * 10 * 10, visitor.visitaCirculo(c), 0.000001);
    }

    @Test
    void areaRetangulo() {
        Retangulo r = new Retangulo(5, 10);
        assertEquals(50, visitor.visitaRetangulo(r), 0.000001);
    }

    @Test
    void areaTriangulo() {
        Triangulo t = new TrianguloEquilatero(2, 4, 6);
        assertEquals((4 * 6) / 2.0, visitor.visitaTriangulo(t), 0.000001);
    }

    @Test
    void areaTrapezio() {
        Trapezio tz = new Trapezio(40, 20, 8, 10, 10);

        double esperado = ((40 + 20) + 8) / 2.0;

        assertEquals(esperado, visitor.visitaTrapezio(tz), 0.000001);
    }
}
