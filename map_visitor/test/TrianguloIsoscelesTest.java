package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import visitor.*;
import elemento.*;

class TrianguloIsoscelesTest {

    @Test
    void getPerimetro_deveSer2LadosMaisBase() {
        TrianguloIsosceles t = new TrianguloIsosceles(5, 6, 4);
        assertEquals(2 * 5 + 6, t.getPerimetro(), 0.000001);
    }
}
