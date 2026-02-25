package visitor;

import elemento.*;

public interface VisitorIF {
	
	public double visitaCirculo(Circulo c);
	public double visitaRetangulo(Retangulo r);
	public double visitaTriangulo(Triangulo t);
	public double visitaTrapezio(Trapezio tz);

}
