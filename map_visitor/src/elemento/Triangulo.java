package elemento;

import visitor.VisitorIF;

public class Triangulo {
	
	private double base;
	private double altura;
	
	public Triangulo(double b, double h) {
		this.base = b;
		this.altura = h;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double aceitaVisita(VisitorIF v) {
		return v.visitaTriangulo(this);
	}

}
