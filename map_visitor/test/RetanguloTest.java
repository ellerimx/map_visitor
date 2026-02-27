package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class RetanguloTest {

    @Test
    void deveGetSetBaseAltura() {
        Retangulo r = new Retangulo(5, 10);
        assertEquals(5, r.getBase(), 0.000001);
        assertEquals(10, r.getAltura(), 0.000001);

        r.setBase(8);
        r.setAltura(12);
        assertEquals(8, r.getBase(), 0.000001);
        assertEquals(12, r.getAltura(), 0.000001);
    }

    @Test
    void aceitaVisita_deveChamarVisitaRetangulo() {
        Retangulo r = new Retangulo(2, 3);

        VisitorIF visitorStub = new VisitorIF() {
            @Override public double visitaCirculo(Circulo c) { return -1; }
            @Override public double visitaRetangulo(Retangulo r) { return 456.0; }
            @Override public double visitaTriangulo(Triangulo t) { return -1; }
            @Override public double visitaTrapezio(Trapezio tz) { return -1; }
        };

        assertEquals(456.0, r.aceitaVisita(visitorStub), 0.000001);
    }
}