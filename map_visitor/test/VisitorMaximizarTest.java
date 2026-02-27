package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class VisitorMaximizarTest {

    private final VisitorMaximizar visitor = new VisitorMaximizar();

    @Test
    void maximizarCirculo_deveDobrarRaio_eRetornarNovoRaio() {
        Circulo c = new Circulo(10);
        double retorno = visitor.visitaCirculo(c);

        assertEquals(20, c.getRaio(), 0.000001);
        assertEquals(20, retorno, 0.000001);
    }

    @Test
    void maximizarRetangulo_deveDobrarBaseEAltura() {
        Retangulo r = new Retangulo(5, 10);
        double retorno = visitor.visitaRetangulo(r);

        assertEquals(10, r.getBase(), 0.000001);
        assertEquals(20, r.getAltura(), 0.000001);
        assertEquals(0, retorno, 0.000001);
    }

    @Test
    void maximizarTriangulo_deveDobrarBaseEAltura() {
        TrianguloEquilatero t = new TrianguloEquilatero(2, 4, 6);
        double retorno = visitor.visitaTriangulo(t);

        assertEquals(8, t.getBase(), 0.000001);
        assertEquals(12, t.getAltura(), 0.000001);
        assertEquals(0, retorno, 0.000001);

        // Observação: lado NÃO é dobrado no seu código (somente base/altura)
        assertEquals(2, t.getLado(), 0.000001);
    }

    @Test
    void maximizarTrapezio_deveDobrarTudo() {
        Trapezio tz = new Trapezio(40, 20, 8, 10, 11);
        double retorno = visitor.visitaTrapezio(tz);

        assertEquals(80, tz.getBaseMaior(), 0.000001);
        assertEquals(40, tz.getBaseMenor(), 0.000001);
        assertEquals(16, tz.getAltura(), 0.000001);
        assertEquals(20, tz.getLado1(), 0.000001);
        assertEquals(22, tz.getLado2(), 0.000001);
        assertEquals(0, retorno, 0.000001);
    }
}
