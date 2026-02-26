package visitor;

import elemento.*;

public class VisitorDesenhar implements VisitorIF {
	
	public double visitaCirculo(Circulo c) {
        return 0;
    }

    public double visitaRetangulo(Retangulo r) {
        return 0;
    }

    public double visitaTriangulo(Triangulo t) {
        return 0;
    }

    public double visitaTrapezio(Trapezio tz) {
        return 0;
    }

}
