package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class TrianguloEquilateroTest {

    @Test
    void getPerimetro_deveSer3VezesOLado() {
        TrianguloEquilatero t = new TrianguloEquilatero(2, 4, 6);
        assertEquals(6, t.getPerimetro(), 0.000001);

        t.setLado(5);
        assertEquals(15, t.getPerimetro(), 0.000001);
    }
}
