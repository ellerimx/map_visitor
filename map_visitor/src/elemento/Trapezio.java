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
		this.setLado1(l1);
		this.setLado2(l2);
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double aceitaVisita(VisitorIF v) {
		return v.visitaTrapezio(this);		
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
}
