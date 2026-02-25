package main;

import elemento.Circulo;
//import visitor.VisitorCalcularArea;
import visitor.*;

public class Main {
	public static void main(String[] args) {
	
	VisitorIF visitorCA = new VisitorCalcularArea();
	Circulo circulo = new Circulo(15);
	double areaCirculo = circulo.aceitaVisita(visitorCA);

	System.out.println("ÁREA DO CIRCULO = " + areaCirculo);
	
	}
}
