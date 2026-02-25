package visitor;

import elemento.*;

public class VisitorCalcularArea implements VisitorIF {
	
	//calculo da area do circulo
	public double visitaCirculo(Circulo c) {
		return 3.14 * c.getRaio() * c.getRaio();
		
	}

	// calculo da area do retangulo
	@Override
	public double visitaRetangulo(Retangulo r) {
		
		return r.getBase() * r.getAltura() ;
	}
	
	// calculo da area do triangulo ((b*a)/2)
	public double visitaTriangulo(Triangulo t) {
		return (t.getBase() * t.getAltura()) / 2;
	}
	
	//calculo da area do trapezio
	public double visitaTrapezio(Trapezio tz) {
		return ( (tz.getBaseMaior() + tz.getBaseMenor() ) + tz.getAltura() ) / 2;
	}

	

}
