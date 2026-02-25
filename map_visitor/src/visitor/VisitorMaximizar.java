package visitor;

import elemento.*;

public class VisitorMaximizar implements VisitorIF{
	// maximizar as medidas das figuras
	
	@Override
	public double visitaCirculo(Circulo c) {
		c.setRaio(c.getRaio() * 2); // maximizar a alterar o valor do raio
		return c.getRaio(); // nova medida do raio
	}

	@Override
	public double visitaRetangulo(Retangulo r) {
		r.setAltura(r.getAltura() * 2) ;
		r.setBase(r.getBase() * 2);
		System.out.println("BASE MAXIMIZADA = " +r.getBase()); // base dobrada
		return r.getAltura(); // altura dobrada
	}
	// ajeitar triangulo e trapezio
	
	@Override
	public double visitaTriangulo(Triangulo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double visitaTrapezio(Trapezio tz) {
		// TODO Auto-generated method stub
		return 0;
	}

}
