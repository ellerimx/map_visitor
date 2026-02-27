package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class TrianguloTest {

    @Test
    void construtor_deveRecusarBaseOuAlturaNaoPositivas() {
        assertThrows(IllegalArgumentException.class, () -> new TrianguloEquilatero(2, 0, 5));
        assertThrows(IllegalArgumentException.class, () -> new TrianguloEquilatero(2, 5, 0));
        assertThrows(IllegalArgumentException.class, () -> new TrianguloEquilatero(2, -1, 5));
        assertThrows(IllegalArgumentException.class, () -> new TrianguloEquilatero(2, 5, -1));
    }

    @Test
    void aceitaVisita_deveChamarVisitaTriangulo() {
        Triangulo t = new TrianguloEquilatero(2, 4, 6);

        VisitorIF visitorStub = new VisitorIF() {
            @Override public double visitaCirculo(Circulo c) { return -1; }
            @Override public double visitaRetangulo(Retangulo r) { return -1; }
            @Override public double visitaTriangulo(Triangulo t) { return 321.0; }
            @Override public double visitaTrapezio(Trapezio tz) { return -1; }
        };

        assertEquals(321.0, t.aceitaVisita(visitorStub), 0.000001);
    }
}
