package elemento;

import visitor.VisitorIF;

public class Trapezio {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double lado1;
	private double lado2;
	
	public Trapezio(double B, double b, double h, double l1, double l2) {
		this.baseMaior = B;
		this.baseMenor = b;
		this.altura = h;
		this.lado1 = l1;
		this.lado2 = l2;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setBaseMaior(double B) {
		this.baseMaior = B;
	}

	public double getBaseMenor() {
		return baseMenor;
	}
	
	public void setBaseMenor(double b) {
		this.baseMenor = b;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double h) {
		this.altura = h;
	}
	
	public double aceitaVisita(VisitorIF v) {
		return v.visitaTrapezio(this);		
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double l1) {
		this.lado1 = l1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double l2) {
		this.lado2 = l2;
	}
}
