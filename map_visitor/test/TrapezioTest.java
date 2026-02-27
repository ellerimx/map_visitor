package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class TrapezioTest {

    @Test
    void deveGetSetCampos() {
        Trapezio tz = new Trapezio(40, 20, 8, 10, 11);

        assertEquals(40, tz.getBaseMaior(), 0.000001);
        assertEquals(20, tz.getBaseMenor(), 0.000001);
        assertEquals(8, tz.getAltura(), 0.000001);
        assertEquals(10, tz.getLado1(), 0.000001);
        assertEquals(11, tz.getLado2(), 0.000001);

        tz.setBaseMaior(50);
        tz.setBaseMenor(25);
        tz.setAltura(9);
        tz.setLado1(12);
        tz.setLado2(13);

        assertEquals(50, tz.getBaseMaior(), 0.000001);
        assertEquals(25, tz.getBaseMenor(), 0.000001);
        assertEquals(9, tz.getAltura(), 0.000001);
        assertEquals(12, tz.getLado1(), 0.000001);
        assertEquals(13, tz.getLado2(), 0.000001);
    }

    @Test
    void aceitaVisita_deveChamarVisitaTrapezio() {
        Trapezio tz = new Trapezio(1, 2, 3, 4, 5);

        VisitorIF visitorStub = new VisitorIF() {
            @Override public double visitaCirculo(Circulo c) { return -1; }
            @Override public double visitaRetangulo(Retangulo r) { return -1; }
            @Override public double visitaTriangulo(Triangulo t) { return -1; }
            @Override public double visitaTrapezio(Trapezio tz) { return 789.0; }
        };

        assertEquals(789.0, tz.aceitaVisita(visitorStub), 0.000001);
    }
}
