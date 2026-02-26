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
	VisitorIF visitorDesenho = new VisitorDesenhar();
	
	System.out.println (" --- CIRCULO ---");	
	Circulo circulo = new Circulo(15); // raio
	
	double areaCirculo = circulo.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO CIRCULO = " + areaCirculo);
	
	double perimetroCirculo = circulo.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO CIRCULO = " + perimetroCirculo);
	
	circulo.aceitaVisita(visitorDesenho);
	System.out.println("MEDIDAS PARA DESENHAR O CIRCULO: raio = "+ circulo.getRaio() + " cm");
	
	circulo.aceitaVisita(visitorMax);
	System.out.println("RAIO MAXIMIZADO = " + circulo.getRaio());	
	
	System.out.println ("\n");
	
	
	System.out.println (" --- RETANGULO ---");	
	Retangulo retangulo = new Retangulo(5,10); // b, h
	
	double areaRetangulo = retangulo.aceitaVisita(visitorCA);	
	System.out.println("ÁREA DO RETANGULO = " +areaRetangulo);
	
	double perimetroRetangulo = retangulo.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO RETANGULO = " + perimetroRetangulo);
	
	retangulo.aceitaVisita(visitorDesenho);
	System.out.println("MEDIDAS PARA DESENHAR O RETANGULO: base = "
	                   + retangulo.getBase() + " cm, " + 
	                   "altura = "+ retangulo.getAltura() + " cm");
	
	retangulo.aceitaVisita(visitorMax);
	System.out.println("ALTURA MAXIMIZADA = " + retangulo.getAltura());
	System.out.println("BASE MAXIMIZADA = " + retangulo.getBase());
	
	System.out.println ("\n");
	
	
	System.out.println (" --- TRIANGULO ---");	
	TrianguloEquilatero trianguloEqui = new TrianguloEquilatero(2,4,6); //lado, base, altura
	TrianguloIsosceles trianguloIso = new TrianguloIsosceles (5,6,4);
	
	double areaTrianguloEqui = trianguloEqui.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRIANGULO EQUILATERO = " + areaTrianguloEqui);
	
	double perimetroEquilatero = trianguloEqui.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO TRIANGULO EQUILATERO = " + perimetroEquilatero);
	
	trianguloEqui.aceitaVisita(visitorDesenho);
	System.out.println("MEDIDAS PARA DESENHAR O TRIANGULO EQUILATERO: base = "
	                   + trianguloEqui.getBase() + " cm, altura = "
	                   + trianguloEqui.getAltura() + " cm, lado = "
	                   + trianguloEqui.getLado() + " cm");
	
	trianguloEqui.aceitaVisita(visitorMax);
	System.out.println("BASE MAXIMIZADA = " + trianguloEqui.getBase());
	System.out.println("ALTURA MAXIMIZADA = " + trianguloEqui.getAltura());
	
	
	System.out.println ("\n");
	
	double areaTrianguloIso = trianguloIso.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRIANGULO ISOSCELES = " + areaTrianguloIso);
	
	double perimetroIso = trianguloIso.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO TRIANGULO ISOSCELES = " + perimetroIso);
	
	trianguloIso.aceitaVisita(visitorDesenho);
	System.out.println("MEDIDAS PARA DESENHAR O TRIANGULO ISOSCELES: base = "
	                   + trianguloIso.getBase() + " cm, altura = "
	                   + trianguloIso.getAltura() + " cm");
	
	trianguloIso.aceitaVisita(visitorMax);
	System.out.println("BASE MAXIMIZADA = " + trianguloIso.getBase());
	System.out.println("ALTURA MAXIMIZADA = " + trianguloIso.getAltura());
	
	System.out.println ("\n");
	
	
	System.out.println (" --- TRAPEZIO ---");
	Trapezio trapezio = new Trapezio(40,20,8, 10, 10); // base maior, base menor, altura, lado1 e lado2
	
	double areaTrapezio = trapezio.aceitaVisita(visitorCA);
	System.out.println("ÁREA DO TRAPEZIO = " +areaTrapezio);
	
	double perimetroTrapezio = trapezio.aceitaVisita(visitorCP);
	System.out.println("PERIMETRO DO TRAPEZIO = " + perimetroTrapezio);
	
	trapezio.aceitaVisita(visitorDesenho);
	System.out.println("MEDIDAS PARA DESENHAR O TRAPEZIO: B = "
	                   + trapezio.getBaseMaior() + " cm, b = "
	                   + trapezio.getBaseMenor() + " cm, h = "
	                   + trapezio.getAltura() + " cm, l1 = "
	                   + trapezio.getLado1() + " cm, l2 = "
	                   + trapezio.getLado2() + " cm");
	
	trapezio.aceitaVisita(visitorMax);
	System.out.println("MEDIDAS MAXIMIZADAS = B:" + trapezio.getBaseMaior()+ "| b:"+trapezio.getBaseMenor() + 
			"| l1:" + trapezio.getLado1() + "| l2:" + trapezio.getLado2() + "| h:" +trapezio.getAltura());
	
	System.out.println ("\n");
	
	
	}
}
