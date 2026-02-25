package main;

import elemento.*; // todos os elementos
//import visitor.VisitorCalcularArea;
import visitor.*;

public class Main {
	public static void main(String[] args) {
	
	VisitorIF visitorCA = new VisitorCalcularArea();
	
	Circulo circulo = new Circulo(15);
	double areaCirculo = circulo.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO CIRCULO = " + areaCirculo);
	
	
	Retangulo retangulo = new Retangulo(5,10); 
	double areaRetangulo = retangulo.aceitaVisita(visitorCA);	
	System.out.println("ÁREA DO RETANGULO = " +areaRetangulo);
	
	Triangulo triangulo = new Triangulo(5,6);
	double areaTriangulo = triangulo.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRIANGULO = " +areaTriangulo);
	
	
	}
}
