package elemento;

import visitor.VisitorIF;

public class Trapezio {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public Trapezio(double B, double b, double h) {
		this.baseMaior = B;
		this.baseMenor = b;
		this.altura = h;
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
}
