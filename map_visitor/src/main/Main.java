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
	//calculo do perimetro:
	VisitorIF visitorCP = new VisitorCalcularPerimetro();
	//desenhar:
	//VisitorIF visitorDesenho = new VisitorDesenhar();
	
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
	
	TrianguloEquilatero trianguloEqui = new TrianguloEquilatero(2,4,6); //lado, base, altura
	TrianguloIsosceles trianguloIso = new TrianguloIsosceles (5,6,4);
	
	double areaTrianguloEqui = trianguloEqui.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRIANGULO EQUILATERO = " + areaTrianguloEqui);
	
	double perimetroEquilatero = trianguloEqui.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO TRIANGULO EQUILATERO = " + perimetroEquilatero);
	System.out.println ("\n");
	
	double areaTrianguloIso = trianguloIso.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRIANGULO ISOSCELES = " + areaTrianguloIso);
	
	double perimetroIso = trianguloIso.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO TRIANGULO ISOSCELES = " + perimetroIso);
	System.out.println ("\n");
	
	
	System.out.println (" --- TRAPEZIO ---");
	
	Trapezio trapezio = new Trapezio(40,20,8, 10, 10); // base maior, base menor, altura, lado1 e lado2
	double areaTrapezio = trapezio.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRAPEZIO = " +areaTrapezio);
	
	double perimetroTrapezio = trapezio.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO TRAPEZIO = " + perimetroTrapezio);
	System.out.println ("\n");
	
	
	
	
	
	}
}
