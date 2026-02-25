package visitor;

import elemento.*;

public class VisitorCalcularPerimetro implements VisitorIF{

	@Override
	public double visitaCirculo(Circulo c) {
		return 2 * 3.14 * c.getRaio();
	}

	@Override
	// soma das medidas dos 4 lados
	public double visitaRetangulo(Retangulo r) {
		return 2 * r.getAltura() + 2 * r.getBase();
	}

	
	// AJUSTAR TRIANGULO E  TRAPEZIO
	@Override
	public double visitaTriangulo(Triangulo t) {
		return 0;
	}

	@Override
	// perimetro = soma dos lados + bases
	public double visitaTrapezio(Trapezio tz) {
		return 0; 
	}
	

}
