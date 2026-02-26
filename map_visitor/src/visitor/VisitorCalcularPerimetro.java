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

	
	@Override
	public double visitaTriangulo(Triangulo t) {
		return t.getPerimetro(); // perimetro diferente para cada tipo de triangulo
	}

	@Override
	// perimetro = soma dos lados + bases
	public double visitaTrapezio(Trapezio tz) {
		return tz.getBaseMaior() + tz.getBaseMenor() + tz.getAltura() + tz.getLado1() + tz.getLado2();
	}
	

}
