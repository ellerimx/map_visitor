package visitor;

import elemento.*;

public class VisitorMaximizar implements VisitorIF{
	// maximizar as medidas das figuras
	
	@Override
	public double visitaCirculo(Circulo c) {
		c.setRaio(c.getRaio() * 2); // maximizar e alterar o valor do raio
		return c.getRaio(); // nova medida do raio
	}	
	

	@Override
	public double visitaRetangulo(Retangulo r) {
		r.setAltura(r.getAltura() * 2) ;
		r.setBase(r.getBase() * 2);
		return 0;
	}
	
	@Override
	public double visitaTriangulo(Triangulo t) {
		t.setAltura(t.getAltura() * 2);
		t.setBase(t.getBase() * 2);
		return 0;
	}
	

	@Override
	public double visitaTrapezio(Trapezio tz) {
		tz.setLado1(tz.getLado1() * 2); // dobrar lado 1
		tz.setLado2(tz.getLado2() * 2); // dobrar lado 2
		tz.setBaseMaior(tz.getBaseMaior() * 2); // dobrar base maior
		tz.setBaseMenor(tz.getBaseMenor() * 2);
		tz.setAltura(tz.getAltura() * 2);
		return 0;
	}

}
