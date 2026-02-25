package main;

import elemento.*; // todos os elementos
//import visitor.VisitorCalcularArea;
import visitor.*;

public class Main {
	public static void main(String[] args) {
	
	// calculo das areas:
	VisitorIF visitorCA = new VisitorCalcularArea();
	// maximização das medidas:
	VisitorIF visitorMax = new VisitorMaximizar();
	
	System.out.println (" --- CIRCULO ---");
	Circulo circulo = new Circulo(15);
	double areaCirculo = circulo.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO CIRCULO = " + areaCirculo);
	
	double maximizarCirculo = circulo.aceitaVisita(visitorMax);
	System.out.println("RAIO MAXIMIZADO = " + maximizarCirculo);
	
	System.out.println ("\n");
	
	
	System.out.println (" --- RETANGULO ---");
	Retangulo retangulo = new Retangulo(5,10); 
	double areaRetangulo = retangulo.aceitaVisita(visitorCA);	
	System.out.println("ÁREA DO RETANGULO = " +areaRetangulo);
	
	double maximizarRetangulo = retangulo.aceitaVisita(visitorMax);
	System.out.println("ALTURA MAXIMIZADA = " + maximizarRetangulo);
	
	System.out.println ("\n");
	
	System.out.println (" --- TRIANGULO ---");
	Triangulo triangulo = new Triangulo(5,6);
	double areaTriangulo = triangulo.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRIANGULO = " +areaTriangulo);
	System.out.println ("\n");
	
	System.out.println (" --- TRAPEZIO ---");
	Trapezio trapezio = new Trapezio(40,15,10);
	double areaTrapezio = trapezio.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRAPEZIO = " +areaTrapezio);
	System.out.println ("\n");
	
	
	
	
	
	}
}
