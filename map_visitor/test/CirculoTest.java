package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class CirculoTest {

    @Test
    void deveGetSetRaio() {
        Circulo c = new Circulo(10);
        assertEquals(10, c.getRaio(), 0.000001);

        c.setRaio(7.5);
        assertEquals(7.5, c.getRaio(), 0.000001);
    }

    @Test
    void aceitaVisita_deveChamarVisitaCirculo() {
        Circulo c = new Circulo(3);

        VisitorIF visitorStub = new VisitorIF() {
            @Override public double visitaCirculo(Circulo c) { return 123.0; }
            @Override public double visitaRetangulo(Retangulo r) { return -1; }
            @Override public double visitaTriangulo(Triangulo t) { return -1; }
            @Override public double visitaTrapezio(Trapezio tz) { return -1; }
        };

        assertEquals(123.0, c.aceitaVisita(visitorStub), 0.000001);
    }
}